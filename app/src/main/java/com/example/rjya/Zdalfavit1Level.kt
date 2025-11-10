package com.example.rjya
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import android.widget.VideoView
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.GridLayout
import kotlin.random.Random
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




data class Question(val questionText: String, val video: String, val correctAnswer: Int)

class Zdalfavit1Level : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var optionsGrid: GridLayout
    private lateinit var questionTextView: TextView
    private lateinit var gestureExplanationText: TextView
    private lateinit var option1: RadioButton
    private lateinit var option2: RadioButton
    private lateinit var option3: RadioButton
    private lateinit var option4: RadioButton

    private var currentQuestionIndex = 0
    private var isCorrectAnswer = false

    private val alphabet = listOf("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ/Ь", "Ы", "Э", "Ю", "Я")

    private val questions = listOf(
        Question("Вопрос 1", "a.mp4", 0),//а
        Question("Вопрос 2", "b.mp4", 1),//б
        Question("Вопрос 3", "v.mp4", 2),//в
        Question("Вопрос 4", "g.mp4", 3),//г
        Question("Вопрос 5", "d.mp4", 4),//д
        Question("Вопрос 6", "e.mp4", 5),//е
        Question("Вопрос 7", "ee.mp4", 6),//ё
        Question("Вопрос 8", "jl.mp4", 7),//ж
        Question("Вопрос 9", "z.mp4", 8),//з
        Question("Вопрос 10", "i.mp4", 9),//и
        Question("Вопрос 11", "io.mp4", 10),//й
        Question("Вопрос 12", "k.mp4", 11),//к
        Question("Вопрос 13", "l.mp4", 12),//л
        Question("Вопрос 14", "m.mp4", 13),//м
        Question("Вопрос 15", "n.mp4", 14),//н
        Question("Вопрос 16", "o.mp4", 15),//о
        Question("Вопрос 17", "p.mp4", 16),//п
        Question("Вопрос 18", "r.mp4", 17),//р
        Question("Вопрос 19", "c.mp4", 18),//с
        Question("Вопрос 20", "t.mp4", 19),//т
        Question("Вопрос 21", "u.mp4", 20),//у
        Question("Вопрос 22", "f.mp4", 21),//ф
        Question("Вопрос 23", "x.mp4", 22),//х
        Question("Вопрос 24", "cht.mp4", 23),//ц
        Question("Вопрос 25", "ch.mp4", 24),//ч
        Question("Вопрос 26", "sh.mp4", 25),//ш
        Question("Вопрос 27", "tsh.mp4", 26),//щ
        Question("Вопрос 28", "tzmz.mp4", 27),//ъ/ь
        Question("Вопрос 29", "ai.mp4", 28),//ы
        Question("Вопрос 30", "aoi.mp4", 29),//э
        Question("Вопрос 31", "iu.mp4", 30),//ю
        Question("Вопрос 32", "ya.mp4", 31),//я
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zdalfavit1_level)

        // Инициализация UI элементов
        videoView = findViewById(R.id.videoView)
        optionsGrid = findViewById(R.id.optionsGrid)
        questionTextView = findViewById(R.id.questionText)
        gestureExplanationText = findViewById(R.id.gestureExplanationText)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)

        // Кнопка "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }

        // Загружаем первый вопрос
        loadQuestion(currentQuestionIndex)

        // Обработка кликов на кнопках
        for (i in 0 until optionsGrid.childCount) {
            val radioButton = optionsGrid.getChildAt(i) as RadioButton
            radioButton.setOnClickListener {
                checkAnswer(i, questions[currentQuestionIndex].correctAnswer)
            }
        }
    }

    private fun loadQuestion(index: Int) {
        val question = questions[index]

        // Отображаем текст вопроса
        questionTextView.text = question.questionText

        // Формируем URI для видео текущего вопроса
        val videoUri = Uri.parse("android.resource://${packageName}/raw/${question.video.removeSuffix(".mp4")}")
        Log.d("Video URI", "Video URI: $videoUri")

        try {
            // Останавливаем предыдущее воспроизведение, если есть
            videoView.stopPlayback()

            // Устанавливаем новый URI для воспроизведения
            videoView.setVideoURI(videoUri)

            // Обработчик ошибок
            videoView.setOnErrorListener { _, what, extra ->
                Log.e("Video Error", "Error code: $what, extra: $extra")
                Toast.makeText(this, "Ошибка воспроизведения видео: Код ошибки $what, $extra", Toast.LENGTH_SHORT).show()
                true
            }

            // Обработчик подготовки видео
            videoView.setOnPreparedListener { mediaPlayer ->
                Log.d("Video Status", "Видео подготовлено и готово к воспроизведению")
                videoView.scaleX = 1.75f
                videoView.scaleY = 1.75f
                videoView.start()  // Запуск воспроизведения
            }



        } catch (e: Exception) {
            Log.e("Video Error", "Исключение при загрузке видео: ${e.message}")
            Toast.makeText(this, "Ошибка при загрузке видео: ${e.message}", Toast.LENGTH_SHORT).show()
        }

        // Генерация неправильных вариантов ответа
        val correctAnswer = question.correctAnswer
        val correctLetter = alphabet[correctAnswer]
        val incorrectLetters = alphabet.filter { it != correctLetter }.shuffled().take(3)

// Перемешиваем ответы с использованием массива
        val allOptions = arrayOf(correctLetter) + incorrectLetters.toTypedArray() // создаем массив
        allOptions.shuffle() // перемешиваем массив

// Обновляем варианты ответов
        val radioButtons = listOf(option1, option2, option3, option4)
        for (i in radioButtons.indices) {
            radioButtons[i].text = allOptions[i]
        }


        // Очищаем выбранный ответ, чтобы начать с чистого листа
        for (i in radioButtons) {
            i.isChecked = false
        }

        // Обновляем пояснение жеста
        gestureExplanationText.text = "Какой жест показан?"
    }

    private fun checkAnswer(selectedOption: Int, correctAnswer: Int) {
        if (isCorrectAnswer) return // Если ответ уже был правильным, ничего не делаем

        val selectedLetter = when (selectedOption) {
            0 -> option1.text.toString()
            1 -> option2.text.toString()
            2 -> option3.text.toString()
            else -> option4.text.toString()
        }

        if (selectedLetter == alphabet[correctAnswer]) {
            isCorrectAnswer = true
            Toast.makeText(this, "Правильно!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Неправильно! Попробуйте снова.", Toast.LENGTH_SHORT).show()
        }

        // Если ответ правильный, загружаем следующий вопрос
        if (isCorrectAnswer) {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                optionsGrid.postDelayed({
                    loadQuestion(currentQuestionIndex)
                    isCorrectAnswer = false
                }, 500)
            } else {
                Toast.makeText(this, "Вы завершили тест!", Toast.LENGTH_LONG).show()
                optionsGrid.postDelayed({
                    finish()
                }, 4000)
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}
