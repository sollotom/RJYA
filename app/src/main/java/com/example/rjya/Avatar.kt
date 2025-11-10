package com.example.rjya

import android.app.NotificationManager
import android.app.NotificationChannel
import android.app.AlarmManager
import android.app.PendingIntent
import android.app.TimePickerDialog
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.app.ActivityCompat
import android.util.Log
import android.Manifest
import android.content.pm.PackageManager
import java.util.*
import java.text.SimpleDateFormat
import java.util.TimeZone

class Avatar : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var alarmManager: AlarmManager
    private lateinit var notificationManager: NotificationManager
    private lateinit var notificationTimeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avatar)

        notificationTimeText = findViewById(R.id.notification_time_text)


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                    1
                )
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        sharedPreferences = getSharedPreferences("AppPreferences", MODE_PRIVATE)


        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "ALERT_CHANNEL",
                "Learning Notifications",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Channel for learning notifications"
            }
            notificationManager.createNotificationChannel(channel)
            Log.d("Avatar", "Notification channel created")
        }

        sharedPreferences = getSharedPreferences("AppPreferences", MODE_PRIVATE)


        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "ALERT_CHANNEL",
                "Learning Notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
            Log.d("Avatar", "Notification channel created")
        }


        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val goalSpinner: Spinner = findViewById(R.id.goal_spinner)
        val repeatsSpinner: Spinner = findViewById(R.id.repeats_spinner)
        val goalAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.goal_values,
            android.R.layout.simple_spinner_item
        )
        goalAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        goalSpinner.adapter = goalAdapter

        val repeatsAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.repeats_values,
            android.R.layout.simple_spinner_item
        )
        repeatsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        repeatsSpinner.adapter = repeatsAdapter


        loadSavedData()


        val setNotificationTimeButton: Button = findViewById(R.id.set_notification_time_button)
        setNotificationTimeButton.setOnClickListener {
            showTimePickerDialog() // Показываем диалог выбора времени
        }

        goalSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                saveData(
                    "goal",
                    goalSpinner.selectedItem.toString()
                )
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        repeatsSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: android.view.View?,
                position: Int,
                id: Long
            ) {
                saveData(
                    "repeats",
                    repeatsSpinner.selectedItem.toString()
                )
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()

        val timePicker = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                try {
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)

                    Log.d("Avatar", "Time selected: $hourOfDay:$minute")

                    scheduleNotification(calendar.timeInMillis)

                    saveNotificationTime(calendar.timeInMillis)

                    setNotificationTime(calendar.timeInMillis)
                } catch (e: Exception) {
                    e.printStackTrace()

                    Log.e("Avatar", "Error in setting time: ${e.message}")
                }
            },
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        )
        timePicker.show()
    }

    private fun scheduleNotification(timeInMillis: Long) {
        Log.d("Avatar", "Notification scheduled at: $timeInMillis")

        try {
            val intent = Intent(this, NotificationReceiver::class.java)
            val pendingIntent =
                PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)


            alarmManager.setExact(
                AlarmManager.RTC_WAKEUP,
                timeInMillis,
                pendingIntent
            )
            Log.d("Avatar", "Notification scheduled at: $timeInMillis")
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("Avatar", "Error scheduling notification: ${e.message}")
        }
    }

    private fun saveData(key: String, value: String) {
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    private fun saveNotificationTime(timeInMillis: Long) {
        val editor = sharedPreferences.edit()
        editor.putLong("notification_time", timeInMillis)
        editor.apply()
    }

    private fun loadSavedData() {
        val goalValue = sharedPreferences.getString("goal", null)
        val repeatsValue = sharedPreferences.getString("repeats", null)
        val notificationTime = sharedPreferences.getLong("notification_time", -1)


        goalValue?.let {
            val goalSpinner: Spinner = findViewById(R.id.goal_spinner)
            val goalAdapter = goalSpinner.adapter as ArrayAdapter<String>
            val position = goalAdapter.getPosition(it)
            goalSpinner.setSelection(position)
        }


        repeatsValue?.let {
            val repeatsSpinner: Spinner = findViewById(R.id.repeats_spinner)
            val repeatsAdapter = repeatsSpinner.adapter as ArrayAdapter<String>
            val position = repeatsAdapter.getPosition(it)
            repeatsSpinner.setSelection(position)
        }


        if (notificationTime != -1L) {
            setNotificationTime(notificationTime)
        }
    }


    private fun setNotificationTime(timeInMillis: Long) {
        val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val formattedTime = dateFormat.format(Date(timeInMillis))
        notificationTimeText.text = "Следующее уведомление в: $formattedTime"
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.d("Avatar", "Notification permission granted")
            } else {
                Log.d("Avatar", "Notification permission denied")
            }
        }
    }

    class NotificationReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent?) {
            Log.d("Avatar", "Receiver triggered")
            val notification = NotificationCompat.Builder(context, "ALERT_CHANNEL")
                .setContentTitle("Пора учить жесты!")
                .setContentText("Не забудьте практиковать ваши жесты!")
                .setSmallIcon(R.drawable.ic_notification)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .build()

            val notificationManager = NotificationManagerCompat.from(context)
            notificationManager.notify(1, notification)
            Log.d("Avatar", "Notification sent")
        }
    }
}
