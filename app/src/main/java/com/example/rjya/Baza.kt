package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Baza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_baza)
        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }

        val buttonA = findViewById<Button>(R.id.Izvini)
        buttonA.setOnClickListener {

            val intent = Intent(this, Izvini::class.java)
            startActivity(intent)
        }

        val buttonK = findViewById<Button>(R.id.Kak)
        buttonK.setOnClickListener {

            val intent = Intent(this, Kakdela::class.java)
            startActivity(intent)
        }
        val buttonN = findViewById<Button>(R.id.No)
        buttonN.setOnClickListener {

            val intent = Intent(this,Net::class.java)
            startActivity(intent)
        }
        val buttonPl = findViewById<Button>(R.id.Ploho)
        buttonPl.setOnClickListener {

            val intent = Intent(this,Ploho::class.java)
            startActivity(intent)
        }
        val buttonPj = findViewById<Button>(R.id.btnPJ)
        buttonPj.setOnClickListener {

            val intent = Intent(this,Pojailysta::class.java)
            startActivity(intent)
        }
        val buttonPo = findViewById<Button>(R.id.btnPoka)
        buttonPo.setOnClickListener {

            val intent = Intent(this,Poka::class.java)
            startActivity(intent)
        }
        val buttonHo = findViewById<Button>(R.id.Help)
        buttonHo.setOnClickListener {

            val intent = Intent(this,Pomogine::class.java)
            startActivity(intent)
        }
        val buttonHi = findViewById<Button>(R.id.btnPrivet)
        buttonHi.setOnClickListener {

            val intent = Intent(this,Privet::class.java)
            startActivity(intent)
        }
        val buttonSe = findViewById<Button>(R.id.btnPdg)
        buttonSe.setOnClickListener {

            val intent = Intent(this,segodnya::class.java)
            startActivity(intent)
        }
        val buttonSp = findViewById<Button>(R.id.btnSpasibo)
        buttonSp.setOnClickListener {

            val intent = Intent(this,spasibo::class.java)
            startActivity(intent)
        }
        val buttonD = findViewById<Button>(R.id.Yes)
        buttonD.setOnClickListener {

            val intent = Intent(this,da::class.java)
            startActivity(intent)
        }
        val buttonVc = findViewById<Button>(R.id.btnGFH)
        buttonVc.setOnClickListener {

            val intent = Intent(this,vchera::class.java)
            startActivity(intent)
        }
        val buttonNoe = findViewById<Button>(R.id.N)
        buttonNoe.setOnClickListener {

            val intent = Intent(this,yaneponimau::class.java)
            startActivity(intent)
        }
        val buttonUT = findViewById<Button>(R.id.btnSD)
        buttonUT.setOnClickListener {

            val intent = Intent(this,ytro::class.java)
            startActivity(intent)
        }
        val buttonZ = findViewById<Button>(R.id.btnASSD)
        buttonZ.setOnClickListener {

            val intent = Intent(this,zavtra::class.java)
            startActivity(intent)
        }

        val buttonHOo = findViewById<Button>(R.id.Horosho)
        buttonHOo.setOnClickListener {

            val intent = Intent(this,horosho::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}