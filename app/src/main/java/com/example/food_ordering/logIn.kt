package com.example.food_ordering

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.food_ordering.databinding.ActivityLogInBinding

class logIn : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.newUser.setOnClickListener {
            startActivity(Intent(this,signUp::class.java))

        }
    }
}