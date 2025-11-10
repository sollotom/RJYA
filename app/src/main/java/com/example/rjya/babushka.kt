package com.example.rjya

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.Button
import android.widget.VideoView
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class babushka : AppCompatActivity() {
    private lateinit var videoView: VideoView
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_babushka)

        // Инициализация VideoView
        videoView = findViewById(R.id.videoView)

        // Получаем путь к видео в папке raw
        val videoUri = Uri.parse("android.resource://${packageName}/raw/babushka")
        videoView.setVideoURI(videoUri)

        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }


        // Устанавливаем слушатель завершения видео
        videoView.setOnCompletionListener {
            // Устанавливаем задержку в 1.5 секунды перед повтором
            handler.postDelayed({
                videoView.start()
            }, 1500) // 1500 миллисекунд = 1.5 секунды
        }

        // Запускаем видео
        videoView.start()

        // Получаем MediaPlayer из VideoView для изменения скорости
        videoView.setOnPreparedListener { mediaPlayer ->

            // Увеличиваем видео, чтобы оно заполнило центр
            videoView.scaleX = 1.75f // Увеличиваем по оси X
            videoView.scaleY = 1.75f // Увеличиваем по оси Y

            // Устанавливаем слушатель для кнопки нормальной скорости
            val btnNormalSpeed = findViewById<Button>(R.id.btnNormalSpeed)
            btnNormalSpeed.setOnClickListener {
                setVideoSpeed(mediaPlayer, 1f) // Воспроизведение с обычной скоростью (1x)
            }

            // Устанавливаем слушатель для кнопки уменьшенной скорости
            val btnHalfSpeed = findViewById<Button>(R.id.btnHalfSpeed)
            btnHalfSpeed.setOnClickListener {
                setVideoSpeed(mediaPlayer, 0.5f) // Воспроизведение с половинной скоростью (0.5x)
            }
            /*val button_B = findViewById<Button>(R.id.Dalie)
            button_B.setOnClickListener {
                val intent = Intent(this, AlfavitB::class.java)
                startActivity(intent)
                }*/



        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setVideoSpeed(mediaPlayer: MediaPlayer, speed: Float) {
        mediaPlayer.playbackParams = mediaPlayer.playbackParams.setSpeed(speed) // Устанавливаем скорость воспроизведения
    }
}
