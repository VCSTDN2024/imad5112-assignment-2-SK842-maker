package com.example.flashcardapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

//kincade is a g//
class Quiz : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextQuestionButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var imageViewQuestions: ImageView


    companion object {

        val images = arrayListOf(
            R.drawable.ram_question,
            R.drawable.ios_question,
            R.drawable.speaker_question,
            R.drawable.monitor_question,
            R.drawable.microsoft_office_question,
            R.drawable.zoom_question,
            R.drawable.vodacom_question,
            R.drawable.server_question,
            R.drawable.pc_question,
            R.drawable.internet_question
        )
//kincade is a g//
        val questions = arrayOf(
        "Ram is considered Secondary storage?",
        "IOS is an example of a system software?",
        "A speaker is considered as an input device?",
        "A monitor is considered an example of Hardware?",
        "Microsoft Office is considered as an web based application?",
        "Zoom is an example of Application Software?",
        "vodacom is an example of an Internet service provider?",
        "A server is a system that allows a program to share resources and information over a network",
        "A PC is a mobile device",
        "The internet can be accessed over any device that supports wifi",
        )

            val answers = booleanArrayOf(false,true,false,true,false,true,true,true,false,true)


    }

    private var currrentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        questionTextView = findViewById(R.id.questionTextview)
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
        nextQuestionButton = findViewById(R.id.nextQuestionButton)
        resultTextView = findViewById(R.id.resultTextView)
        imageViewQuestions = findViewById(R.id.imageViewQuestions)

        showQuestion()

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }


        nextQuestionButton.setOnClickListener {
        questionTextView.text = (questions[currrentQuestionIndex])
        imageViewQuestions.setImageResource(images[currrentQuestionIndex])
            currrentQuestionIndex++


            if (currrentQuestionIndex < questions.size) {
                showQuestion()
                resultTextView.text = ""
                trueButton.isEnabled = true
                falseButton.isEnabled = true

            }else{

            val intent = Intent(this, Score::class.java)
            intent.putExtra("score" , score)
               startActivity(intent)
            finish()
            }
        }
        nextQuestionButton.isEnabled = false

        }

        private fun showQuestion() {
            questionTextView.text = questions[currrentQuestionIndex]
            imageViewQuestions.setImageResource(images[currrentQuestionIndex]) //setImageResource links the array of images to the current Question Index//

        }

        private fun checkAnswer(userAnswer: Boolean) {
            val correctAnswer =  answers[currrentQuestionIndex]

            if (userAnswer == correctAnswer) {
                resultTextView.text = "That is Correct! Well done!"
                resultTextView.setTextColor(Color.GREEN)
                score++
            }else{
                resultTextView.text = "That is Incorrect!"
                resultTextView.setTextColor(Color.RED)

            }

            trueButton.isEnabled = true
            falseButton.isEnabled = true
            nextQuestionButton.isEnabled = true


            }
        }

