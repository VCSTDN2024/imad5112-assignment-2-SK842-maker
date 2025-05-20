package com.example.flashcardapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val imageViewFeedback = findViewById<ImageView>(R.id.imageViewFeedback)

        var score = intent.getIntExtra("score", 0)
        scoreTextView.text = "This is how you scored: $score/10"

        // these two variables are displayed after the score is displayed when the quiz is finished//
        // the if and ele if functions tells the user if they score 10 >5 or <4 the quiz will give feedback based on how the user scored and will display an image based off  the final score//

        var feedback: String = ""
        var imageRes: Int = R.drawable.champion_award

        if (score == 10) {
            feedback = "You are the Champion!"
            imageRes = R.drawable.champion_award
        }else if (score >5) {
            feedback = "Not bad well done"
            imageRes = R.drawable.clapping_score
        }else if (score<4) {
            feedback = "You can do better next time"
            imageRes = R.drawable.fail_question

        } else {
           error("Marks could not be generated")  //error message displayed if the score could not be generated//
        }


        feedbackTextView.text = feedback
        imageViewFeedback.setImageResource(imageRes)



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