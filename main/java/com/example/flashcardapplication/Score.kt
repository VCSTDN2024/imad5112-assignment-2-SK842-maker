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

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        val scoreTextView = findViewById<TextView>(R.id.scoreTextview)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextview)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)



        var score = intent.getIntExtra("score", 0)
        scoreTextView.text = "This is how you scored: $score/10"


        val feedback = if (score == 10) {
            "You are the Champion!"
        }else if (score >=5) {
            "Not bad well done"

        }else if (score<=4) {
            "You can do better next time"

        } else {
            "Marks could not be generated"
        }

        feedbackTextView.text = feedback.toString()



        reviewButton.setOnClickListener {

            val intent = Intent(this, Review::class.java)
            intent.putExtra("questions", Quiz.questions)
            intent.putExtra("answers", Quiz.answers)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

    }
}