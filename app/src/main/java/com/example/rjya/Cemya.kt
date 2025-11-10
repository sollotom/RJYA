package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Cemya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cemya)

        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }
        val buttonUT = findViewById<Button>(R.id.Izvini)
        buttonUT.setOnClickListener {

            val intent = Intent(this,babushka::class.java)
            startActivity(intent)
        }
        val buttonB = findViewById<Button>(R.id.Horosho)
        buttonB.setOnClickListener {

            val intent = Intent(this,brat::class.java)
            startActivity(intent)
        }
        val buttonDe = findViewById<Button>(R.id.Tak)
        buttonDe.setOnClickListener {

            val intent = Intent(this,dedyshka::class.java)
            startActivity(intent)
        }
        val buttonDr = findViewById<Button>(R.id.Nelzya)
        buttonDr.setOnClickListener {

            val intent = Intent(this,dryg::class.java)
            startActivity(intent)
        }
        val buttonJe = findViewById<Button>(R.id.Mokjno)
        buttonJe.setOnClickListener {

            val intent = Intent(this,jena::class.java)
            startActivity(intent)
        }
        val buttonMa = findViewById<Button>(R.id.No)
        buttonMa.setOnClickListener {

            val intent = Intent(this,mama::class.java)
            startActivity(intent)
        }
        val buttonMj = findViewById<Button>(R.id.Help)
        buttonMj.setOnClickListener {

            val intent = Intent(this,myj::class.java)
            startActivity(intent)
        }
        val buttonPa = findViewById<Button>(R.id.Kak)
        buttonPa.setOnClickListener {

            val intent = Intent(this,papa::class.java)
            startActivity(intent)
        }
        val buttonPeb = findViewById<Button>(R.id.N)
        buttonPeb.setOnClickListener {

            val intent = Intent(this,rebenok::class.java)
            startActivity(intent)
        }
        val buttonSes = findViewById<Button>(R.id.Ploho)
        buttonSes.setOnClickListener {

            val intent = Intent(this,sestra::class.java)
            startActivity(intent)
        }
        val buttonYa = findViewById<Button>(R.id.btnPrivet)
        buttonYa.setOnClickListener {

            val intent = Intent(this,ya::class.java)
            startActivity(intent)
        }
        val buttonTa = findViewById<Button>(R.id.btnPoka)
        buttonTa.setOnClickListener {

            val intent = Intent(this,tai::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}