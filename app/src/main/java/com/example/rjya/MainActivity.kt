package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Устанавливаем светлый режим
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        // Обработчики кнопок
        findViewById<Button>(R.id.btnAlphavit).setOnClickListener {
            startActivity(Intent(this, Alfavit::class.java))
        }
        findViewById<Button>(R.id.imageButton4).setOnClickListener {
            startActivity(Intent(this, Informachiya::class.java))
        }

        findViewById<ImageButton>(R.id.btnInfoRight).setOnClickListener {
            startActivity(Intent(this, InfoRab::class.java))
        }

      /*  findViewById<ImageButton>(R.id.imageButton5).setOnClickListener {
            startActivity(Intent(this, Avatar::class.java))
        }*/

        findViewById<Button>(R.id.button_repeat).setOnClickListener {
            startActivity(Intent(this, Uprojneniya::class.java))
        }

        findViewById<ImageButton>(R.id.btnPoisk).setOnClickListener {
            startActivity(Intent(this, Poisk::class.java))
        }

        findViewById<Button>(R.id.btnPrivet).setOnClickListener {
            startActivity(Intent(this, Baza::class.java))
        }

        findViewById<Button>(R.id.btnZnacoms).setOnClickListener {
            startActivity(Intent(this, Cemya::class.java))
        }
        findViewById<Button>(R.id.button_repeat2).setOnClickListener {
            startActivity(Intent(this, SlovoNaDactile::class.java))
        }
    }
}
