package com.example.flashcardapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class Review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review)

        val reviewTextView = findViewById<TextView>(R.id.reviewTextview)
        val restartButton  = findViewById<Button>(R.id.restartButton)
        val exitButton= findViewById<Button>(R.id.exitButton)


        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")



        val reviewText = StringBuilder()
        if(questions != null && answers != null && questions.size == answers.size){
            for (i in questions.indices) {
                    reviewText.append("${i + 1} - ${questions[i]}\n")
                    reviewText.append(" correctAnswer:${if (answers[i]) "True" else "False"}\n")

            }
            reviewTextView.text = reviewText.toString()
        }else{
            reviewTextView.text = error("Unable to review the Questions you got wrong.")

        }

        restartButton.setOnClickListener {
            startActivity(Intent(this, Quiz::class.java))
        }

        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

    }
}