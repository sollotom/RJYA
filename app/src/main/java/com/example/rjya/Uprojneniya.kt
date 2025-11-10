package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class Uprojneniya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uprojneniya)

        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }
        val button_A = findViewById<Button>(R.id.btnAlphavit)
        button_A.setOnClickListener {
            val intent = Intent(this, Zdalfavit1Level::class.java)
            startActivity(intent)
        }
        val button_B = findViewById<Button>(R.id.btnPrivet)
        button_B.setOnClickListener {
            val intent = Intent(this, Zdalfavit2Level::class.java)
            startActivity(intent)
        }
        val button_G = findViewById<Button>(R.id.btnZnacoms)
        button_G.setOnClickListener {
            val intent = Intent(this, Zdalfavit3Level::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
