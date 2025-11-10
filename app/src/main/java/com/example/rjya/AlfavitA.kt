package com.example.rjya

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlfavitA : AppCompatActivity() {
    private lateinit var videoView: VideoView
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alfavit2)

        videoView = findViewById(R.id.videoView)

        val videoUri = Uri.parse("android.resource://${packageName}/raw/a")
        videoView.setVideoURI(videoUri)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        videoView.setOnCompletionListener {
            handler.postDelayed({
                videoView.start()
            }, 1500)
        }

        videoView.setOnPreparedListener { mediaPlayer ->
            videoView.scaleX = 1.75f
            videoView.scaleY = 1.75f

            val btnNormalSpeed = findViewById<Button>(R.id.btnNormalSpeed)
            btnNormalSpeed.setOnClickListener {
                setVideoSpeed(mediaPlayer, 1f)
            }

            val btnHalfSpeed = findViewById<Button>(R.id.btnHalfSpeed)
            btnHalfSpeed.setOnClickListener {
                setVideoSpeed(mediaPlayer, 0.5f)
            }


        }

        videoView.start()
    }

    private fun setVideoSpeed(mediaPlayer: MediaPlayer, speed: Float) {
        mediaPlayer.playbackParams = mediaPlayer.playbackParams.setSpeed(speed)
    }
}
