package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityConjunctionBinding

class ConjunctionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConjunctionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConjunctionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        binding.btSubmit.setOnClickListener(){
            checkAnswers()
        }
    }

    private fun checkAnswers(){
        var correctAnswer = 0
        val answer1 = binding.etAnswer1.text.toString()
        val answer2 = binding.etAnswer2.text.toString()
        val answer3 = binding.etAnswer3.text.toString()
        val answer4 = binding.etAnswer4.text.toString()

        if (answer1 == getString(R.string.value_true)){
            correctAnswer++
        }

        if (answer2 == getString(R.string.value_false)){
            correctAnswer++
        }

        if (answer3 == getString(R.string.value_false)){
            correctAnswer++
        }

        if (answer4 == getString(R.string.value_false)){
            correctAnswer++
        }

        Toast.makeText(this, getString(R.string.correct,correctAnswer), Toast.LENGTH_SHORT).show()
    }
}