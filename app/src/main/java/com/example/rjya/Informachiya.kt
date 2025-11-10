package com.example.rjya

import android.os.Bundle
import android.text.Html
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class Informachiya : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informachiya)

        // Настраиваем кнопку "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }

        // Получаем ссылку на TextView
        val textView = findViewById<TextView>(R.id.textView)

        // Применяем HTML-текст
        val htmlText = """
            <b>Что такое РЖЯ?</b><br><br>
            РЖЯ (Рука Жестового Языка) – это система жестов, которая используется людьми с нарушениями слуха для общения. В отличие от устной речи, РЖЯ основывается на визуальных сигналах, передаваемых с помощью рук и тела. Это важная часть культуры людей с нарушениями слуха, и овладение этим языком способствует улучшению их взаимодействия с миром.<br><br>

            <b>Что такое Дактиль?</b><br><br>
            Дактиль – это система жестов, при которой каждая буква алфавита обозначается отдельным жестом с использованием рук, в том числе пальцев. Дактиль используется для обозначения букв, слов или имен, которые не имеют собственного жеста в жестовом языке. Таким образом, дактиль играет важную роль в коммуникации, помогая людям с нарушениями слуха понимать и передавать информацию, которая может не иметь своего символа в жестовом языке.<br><br>

            <b>Зачем нужно учить РЖЯ?</b><br><br>
            Изучение РЖЯ – это не просто полезное, но и необходимое умение. Знание РЖЯ позволяет нам стать более инклюзивными и восприимчивыми к нуждам людей с нарушениями слуха. Оно помогает не только в общении, но и в создании более комфортных условий для жизни таких людей. Через изучение РЖЯ, мы способствуем лучшему взаимодействию с этой социальной группой, устраняем барьеры в коммуникации и создаем более доступное общество для всех.<br><br>

            <b>Как учить РЖЯ?</b><br><br>
            Изучение РЖЯ требует времени и практики. Важно начать с основ – алфавита и простых жестов, постепенно переходя к более сложным конструкциям. Занятия с опытными преподавателями, а также самостоятельная практика и общение с носителями жестового языка помогут вам быстро овладеть этим важным инструментом общения. Помните, что регулярные тренировки и практика являются ключевыми аспектами в освоении РЖЯ.<br><br>

                <font color="#CD5C5C"><b>Обязательно тренируйте как можно чаще!</b></font>
        """.trimIndent()

        // Устанавливаем HTML-текст
        textView.text = Html.fromHtml(htmlText, Html.FROM_HTML_MODE_LEGACY)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}
