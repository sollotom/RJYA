package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alfavit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_alfavit)

        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }
    
        val buttonA = findViewById<Button>(R.id.btnA)
        buttonA.setOnClickListener {

            val intent = Intent(this, AlfavitA::class.java)
            startActivity(intent)
        }

        val buttonB = findViewById<Button>(R.id.btnB)
        buttonB.setOnClickListener {

            val intent = Intent(this, AlfavitB::class.java)
            startActivity(intent)
        }
        val buttonv = findViewById<Button>(R.id.btnV)
        buttonv.setOnClickListener {
            val intent = Intent(this, AlfavitV::class.java)
            startActivity(intent)
        }
        val buttong = findViewById<Button>(R.id.btnG)
        buttong.setOnClickListener {
            val intent = Intent(this, AlfavitG::class.java)
            startActivity(intent)
        }
        val button_repeat = findViewById<Button>(R.id.button_repeat)
        button_repeat.setOnClickListener {
            val intent = Intent(this, Uprojneniya::class.java)
            startActivity(intent)
        }
        val button_d = findViewById<Button>(R.id.btnD)
        button_d.setOnClickListener {
            val intent = Intent(this, AlfavitD::class.java)
            startActivity(intent)
        }
        val button_e = findViewById<Button>(R.id.btnE)
        button_e.setOnClickListener {
            val intent = Intent(this, AlfavitE::class.java)
            startActivity(intent)
        }
        val button_ee = findViewById<Button>(R.id.btnIO)
        button_ee.setOnClickListener {
            val intent = Intent(this, AlfavitEE::class.java)
            startActivity(intent)
        }
        val button_J = findViewById<Button>(R.id.btnJ)
        button_J.setOnClickListener {
            val intent = Intent(this, AlfavitJ::class.java)
            startActivity(intent)
        }
        val button_Z = findViewById<Button>(R.id.btnZ)
        button_Z.setOnClickListener {
            val intent = Intent(this, AlfavitZ::class.java)
            startActivity(intent)
        }
        val button_I = findViewById<Button>(R.id.btnI)
        button_I.setOnClickListener {
            val intent = Intent(this, AlfavitI::class.java)
            startActivity(intent)
        }
        val button_IO = findViewById<Button>(R.id.btnIOI)
        button_IO.setOnClickListener {
            val intent = Intent(this, AlfavitIO::class.java)
            startActivity(intent)
        }
        val button_K = findViewById<Button>(R.id.btnK)
        button_K.setOnClickListener {
            val intent = Intent(this, AlfavitK::class.java)
            startActivity(intent)
        }
        val button_L = findViewById<Button>(R.id.btnL)
        button_L.setOnClickListener {
            val intent = Intent(this, AlfavitL::class.java)
            startActivity(intent)
        }
        val button_M = findViewById<Button>(R.id.btnM)
        button_M.setOnClickListener {
            val intent = Intent(this, AlfavitM::class.java)
            startActivity(intent)
        }
        val button_N = findViewById<Button>(R.id.btnN)
        button_N.setOnClickListener {
            val intent = Intent(this, AlfavitN::class.java)
            startActivity(intent)
        }
        val button_O = findViewById<Button>(R.id.btnO)
        button_O.setOnClickListener {
            val intent = Intent(this, AlfavitO::class.java)
            startActivity(intent)
        }
        val button_P = findViewById<Button>(R.id.btnP)
        button_P.setOnClickListener {
            val intent = Intent(this, AlfavitP::class.java)
            startActivity(intent)
        }
        val button_R = findViewById<Button>(R.id.btnR)
        button_R.setOnClickListener {
            val intent = Intent(this, AlfavitR::class.java)
            startActivity(intent)
        }
        val button_C = findViewById<Button>(R.id.btnC)
        button_C.setOnClickListener {
            val intent = Intent(this, AlfavitC::class.java)
            startActivity(intent)
        }
        val button_T = findViewById<Button>(R.id.btnT)
        button_T.setOnClickListener {
            val intent = Intent(this, AlfavitT::class.java)
            startActivity(intent)
        }
        val button_U = findViewById<Button>(R.id.btnY)
        button_U.setOnClickListener {
            val intent = Intent(this, AlfavitU::class.java)
            startActivity(intent)
        }
        val button_F = findViewById<Button>(R.id.btnF)
        button_F.setOnClickListener {
            val intent = Intent(this, AlfavitF::class.java)
            startActivity(intent)
        }
        val button_X = findViewById<Button>(R.id.btnX)
        button_X.setOnClickListener {
            val intent = Intent(this, AlfavitX::class.java)
            startActivity(intent)
        }
        val button_Ch = findViewById<Button>(R.id.btnJT)
        button_Ch.setOnClickListener {
            val intent = Intent(this, AlfavitCH::class.java)
            startActivity(intent)
        }
        val button_Cht = findViewById<Button>(R.id.btnJTI)
        button_Cht.setOnClickListener {
            val intent = Intent(this, AlfavitCHT::class.java)
            startActivity(intent)
        }
        val button_Sh = findViewById<Button>(R.id.btnSH)
        button_Sh.setOnClickListener {
            val intent = Intent(this, AlfavitSH::class.java)
            startActivity(intent)
        }
        val button_TSh = findViewById<Button>(R.id.btnSHI)
        button_TSh.setOnClickListener {
            val intent = Intent(this, AlfavitTSH::class.java)
            startActivity(intent)
        }
        val button_TZMZ = findViewById<Button>(R.id.btnTanaM)
        button_TZMZ.setOnClickListener {
            val intent = Intent(this, AlfavitTZMZ::class.java)
            startActivity(intent)
        }
        val button_AI = findViewById<Button>(R.id.btnII)
        button_AI.setOnClickListener {
            val intent = Intent(this, AlfavitAI::class.java)
            startActivity(intent)
        }
        val button_UI = findViewById<Button>(R.id.btnU)
        button_UI.setOnClickListener {
            val intent = Intent(this, AlfavitUI::class.java)
            startActivity(intent)
        }
        val button_IU = findViewById<Button>(R.id.btnYU)
        button_IU.setOnClickListener {
            val intent = Intent(this, AlfavitIU::class.java)
            startActivity(intent)
        }
        val button_YA = findViewById<Button>(R.id.btnYA)
        button_YA.setOnClickListener {
            val intent = Intent(this, AlfavitYA::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
