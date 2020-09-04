package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madlevel1task2.databinding.ActivityConjunctionBinding

class ConjunctionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConjunctionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConjunctionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}