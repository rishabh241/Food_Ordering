package com.example.food_ordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food_ordering.databinding.ActivitySignUpBinding

class signUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}