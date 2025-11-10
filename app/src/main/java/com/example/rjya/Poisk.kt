package com.example.rjya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat





class Poisk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_poisk) // Устанавливаем макет ДО поиска элементов

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



        val buttonAAA = findViewById<Button>(R.id.Izvini)
        buttonAAA.setOnClickListener {

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

        val buttonUTr = findViewById<Button>(R.id.Izvinir)
        buttonUTr.setOnClickListener {

            val intent = Intent(this,babushka::class.java)
            startActivity(intent)
        }
        val buttonBr = findViewById<Button>(R.id.Horoshor)
        buttonBr.setOnClickListener {

            val intent = Intent(this,brat::class.java)
            startActivity(intent)
        }
        val buttonDe = findViewById<Button>(R.id.Takr)
        buttonDe.setOnClickListener {

            val intent = Intent(this,dedyshka::class.java)
            startActivity(intent)
        }
        val buttonDr = findViewById<Button>(R.id.Nelzyar)
        buttonDr.setOnClickListener {

            val intent = Intent(this,dryg::class.java)
            startActivity(intent)
        }
        val buttonJe = findViewById<Button>(R.id.Mokjnor)
        buttonJe.setOnClickListener {
            val intent = Intent(this,jena::class.java)
            startActivity(intent)
        }
        val buttonMa = findViewById<Button>(R.id.Nor)
        buttonMa.setOnClickListener {
            val intent = Intent(this,mama::class.java)
            startActivity(intent)
        }
        val buttonMj = findViewById<Button>(R.id.Helpr)
        buttonMj.setOnClickListener {
            val intent = Intent(this,myj::class.java)
            startActivity(intent)
        }
        val buttonPa = findViewById<Button>(R.id.Kakr)
        buttonPa.setOnClickListener {
            val intent = Intent(this,papa::class.java)
            startActivity(intent)
        }
        val buttonPeb = findViewById<Button>(R.id.Nr)
        buttonPeb.setOnClickListener {
            val intent = Intent(this,rebenok::class.java)
            startActivity(intent)
        }
        val buttonSes = findViewById<Button>(R.id.Plohor)
        buttonSes.setOnClickListener {
            val intent = Intent(this,sestra::class.java)
            startActivity(intent)
        }
        val buttonYa = findViewById<Button>(R.id.btnPrivetr)
        buttonYa.setOnClickListener {
            val intent = Intent(this,ya::class.java)
            startActivity(intent)
        }
        val buttonTa = findViewById<Button>(R.id.btnPokar)
        buttonTa.setOnClickListener {
            val intent = Intent(this,tai::class.java)
            startActivity(intent)
        }


        val searchField = findViewById<EditText>(R.id.searchField)
        val btnSearch = findViewById<ImageButton>(R.id.btnPoisk)

        btnSearch.setOnClickListener {
            val query = searchField.text.toString().trim()
            if (query.isNotEmpty()) {
                searchWord(query)
            } else {
                Toast.makeText(this, "Введите слово для поиска", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Функция поиска слов
    private fun searchWord(query: String) {
        when (query.lowercase()) {
            "алфавит" -> {
                startActivity(Intent(this, Alfavit::class.java))
            }
            "а" -> {
                startActivity(Intent(this, AlfavitA::class.java))
            }
            "б" -> {
                startActivity(Intent(this, AlfavitB::class.java))
            }
            "в" -> {
                startActivity(Intent(this, AlfavitV::class.java))
            }
            "г" -> {
                startActivity(Intent(this, AlfavitG::class.java))
            }
            "д" -> {
                startActivity(Intent(this, AlfavitD::class.java))
            }
            "е" -> {
                startActivity(Intent(this, AlfavitE::class.java))
            }
            "ё" -> {
                startActivity(Intent(this, AlfavitEE::class.java))
            }
            "ж" -> {
                startActivity(Intent(this, AlfavitJ::class.java))
            }
            "з" -> {
                startActivity(Intent(this, AlfavitZ::class.java))
            }
            "и" -> {
                startActivity(Intent(this, AlfavitI::class.java))
            }
            "й" -> {
                startActivity(Intent(this, AlfavitIO::class.java))
            }
            "к" -> {
                startActivity(Intent(this, AlfavitK::class.java))
            }
            "л" -> {
                startActivity(Intent(this, AlfavitL::class.java))
            }
            "м" -> {
                startActivity(Intent(this, AlfavitM::class.java))
            }
            "н" -> {
                startActivity(Intent(this, AlfavitN::class.java))
            }
            "о" -> {
                startActivity(Intent(this, AlfavitO::class.java))
            }
            "п" -> {
                startActivity(Intent(this, AlfavitP::class.java))
            }
            "р" -> {
                startActivity(Intent(this, AlfavitR::class.java))
            }
            "с" -> {
                startActivity(Intent(this, AlfavitC::class.java))
            }
            "т" -> {
                startActivity(Intent(this, AlfavitT::class.java))
            }
            "у" -> {
                startActivity(Intent(this, AlfavitU::class.java))
            }
            "ф" -> {
                startActivity(Intent(this, AlfavitF::class.java))
            }
            "х" -> {
                startActivity(Intent(this, AlfavitX::class.java))
            }
            "ц" -> {
                startActivity(Intent(this, AlfavitCH::class.java))
            }
            "ч" -> {
                startActivity(Intent(this, AlfavitCHT::class.java))
            }
            "ш" -> {
                startActivity(Intent(this, AlfavitSH::class.java))
            }
            "щ" -> {
                startActivity(Intent(this, AlfavitTSH::class.java))
            }
            "ь/ъ" -> {
                startActivity(Intent(this, AlfavitTZMZ::class.java))
            }
            "ы" -> {
                startActivity(Intent(this, AlfavitAI::class.java))
            }
            "э" -> {
                startActivity(Intent(this, AlfavitUI::class.java))
            }
            "ю" -> {
                startActivity(Intent(this, AlfavitIU::class.java))
            }
            "я(буква)" -> {
                startActivity(Intent(this, AlfavitYA::class.java))
            }
            "извините" -> {
                startActivity(Intent(this, Izvini::class.java))
            }
            "извини" -> {
                startActivity(Intent(this, Izvini::class.java))
            }
            "как дела" -> {
                startActivity(Intent(this, Kakdela::class.java))
            }
            "нет" -> {
                startActivity(Intent(this, Net::class.java))
            }
            "плохо" -> {
                startActivity(Intent(this, Ploho::class.java))
            }
            "пока" -> {
                startActivity(Intent(this, Poka::class.java))
            }
            "пожалуйста" -> {
                startActivity(Intent(this, Pojailysta::class.java))
            }
            "помогите" -> {
                startActivity(Intent(this, Pomogine::class.java))
            }
            "привет" -> {
                startActivity(Intent(this, Privet::class.java))
            }
            "сегодня" -> {
                startActivity(Intent(this, segodnya::class.java))
            }
            "спасибо" -> {
                startActivity(Intent(this, spasibo::class.java))
            }
            "да" -> {
                startActivity(Intent(this, da::class.java))
            }
            "вчера" -> {
                startActivity(Intent(this, vchera::class.java))
            }
            "я не понимаю" -> {
                startActivity(Intent(this, yaneponimau::class.java))
            }
            "утро" -> {
                startActivity(Intent(this, ytro::class.java))
            }
            "завтра" -> {
                startActivity(Intent(this, zavtra::class.java))
            }
            "хорошо" -> {
                startActivity(Intent(this, horosho::class.java))
            }
            "бабушка" -> {
                startActivity(Intent(this, babushka::class.java))
            }
            "брат" -> {
                startActivity(Intent(this, brat::class.java))
            }
            "дедушка" -> {
                startActivity(Intent(this, dedyshka::class.java))
            }
            "друг" -> {
                startActivity(Intent(this, dryg::class.java))
            }
            "жена" -> {
                startActivity(Intent(this, jena::class.java))
            }
            "мама" -> {
                startActivity(Intent(this, mama::class.java))
            }
            "муж" -> {
                startActivity(Intent(this, myj::class.java))
            }
            "папа" -> {
                startActivity(Intent(this, papa::class.java))
            }
            "ребенок" -> {
                startActivity(Intent(this, rebenok::class.java))
            }
            "сестра" -> {
                startActivity(Intent(this, sestra::class.java))
            }
            "я" -> {
                startActivity(Intent(this, ya::class.java))
            }
            "ты" -> {
                startActivity(Intent(this, tai::class.java))
            }
            else -> {
                Toast.makeText(this, "Слово не найдено", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}
