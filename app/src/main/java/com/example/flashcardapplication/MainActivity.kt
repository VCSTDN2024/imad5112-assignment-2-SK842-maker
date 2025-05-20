package com.example.flashcardapplication

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val startQuizTextView = findViewById<TextView>(R.id.starQuizTextView)

        val slideInLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left)
        val slideInRight =  AnimationUtils.loadAnimation(this, R.anim.slide_in_right)

        welcomeTextView.startAnimation(slideInRight)
        startQuizTextView.startAnimation(slideInLeft)

        val startButton = findViewById<Button>(R.id.startButton)
        val exitButton = findViewById<Button>(R.id.exitButton)


        startButton.setOnClickListener {
            startActivity(Intent(this, Quiz::class.java))
        }

        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}