package com.example.rjya

import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewGroup.MarginLayoutParams

class SlovoNaDactile : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var wordInput: EditText
    private lateinit var playButton: Button
    private lateinit var letterText: TextView
    private lateinit var initialImage: ImageView  // Изображение
    private lateinit var mediaContainer: FrameLayout  // Контейнер для изображения и видео

    private var letters: CharArray = charArrayOf()
    private var currentIndex = 0


    // Соответствие русских букв и имен файлов
    private val letterToFileMap = mapOf(
        'а' to "a", 'б' to "b", 'в' to "v", 'г' to "g", 'д' to "d",
        'е' to "e", 'ё' to "ee", 'ж' to "jl", 'з' to "z", 'и' to "i",
        'й' to "io", 'к' to "k", 'л' to "l", 'м' to "m", 'н' to "n",
        'о' to "o", 'п' to "p", 'р' to "r", 'с' to "c", 'т' to "t",
        'у' to "u", 'ф' to "f", 'х' to "x", 'ц' to "cht", 'ч' to "ch",
        'ш' to "sh", 'щ' to "tsh", 'ъ' to "tzmz", 'ь' to "tzmz",
        'ы' to "ai", 'э' to "aoi", 'ю' to "iu", 'я' to "ya"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slovo_na_dactile)

        // Инициализация элементов интерфейса
        videoView = findViewById(R.id.videoView)
        wordInput = findViewById(R.id.wordInput)
        playButton = findViewById(R.id.playButton)
        letterText = findViewById(R.id.letterText)
        initialImage = findViewById(R.id.initialImage)  // Инициализация начального изображения
        mediaContainer = findViewById(R.id.mediaContainer)  // Контейнер для изображения и видео

        // Обработчик нажатия кнопки "Проиграть"
        playButton.setOnClickListener {
            val word = wordInput.text.toString().lowercase()
            if (word.isNotEmpty()) {
                letters = word.toCharArray()
                currentIndex = 0
                // Скрыть изображение и показать видео
                initialImage.visibility = ImageView.GONE  // Скрываем изображение
                videoView.visibility = VideoView.VISIBLE  // Показываем видео
                playNextLetter()
            } else {
                Toast.makeText(this, "Пожалуйста, введите слово", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun playNextLetter() {
        if (currentIndex >= letters.size) {
            letterText.text = "Готово!"
            return
        }
        // Кнопка "Назад"
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Закрываем текущую активность
        }

        val letter = letters[currentIndex]
        val fileName = letterToFileMap[letter]

        if (fileName != null) {
            val resId = resources.getIdentifier(fileName, "raw", packageName)
            if (resId != 0) {
                val uri = Uri.parse("android.resource://$packageName/$resId")
                letterText.text = "Буква: ${letter.uppercase()}"
                videoView.setVideoURI(uri)

                videoView.setOnPreparedListener { mp ->
                    // Увеличиваем видео с обрезкой по бокам
                    videoView.scaleX = 10.4f
                    videoView.scaleY = 10.4f

                    // Сдвиг видео вправо
                    val layoutParams = videoView.layoutParams as MarginLayoutParams
                    layoutParams.setMargins(750, 500, 0, 0) // Установите значение отступа слева, чтобы сдвинуть вправо
                    videoView.layoutParams = layoutParams

                    videoView.start()
                }

                // Устанавливаем слушатель на окончание воспроизведения
                videoView.setOnCompletionListener {
                    currentIndex++
                    playNextLetter()
                }
                videoView.start()
            } else {
                // В случае, если видео для буквы не найдено
                Toast.makeText(this, "Нет видео для буквы: $letter", Toast.LENGTH_SHORT).show()
                currentIndex++
                playNextLetter()
            }
        } else {
            // В случае, если буква не найдена в карте
            Toast.makeText(this, "Неизвестная буква: $letter", Toast.LENGTH_SHORT).show()
            currentIndex++
            playNextLetter()
        }
    }
}
