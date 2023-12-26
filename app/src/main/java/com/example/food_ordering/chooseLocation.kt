package com.example.food_ordering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.food_ordering.databinding.ActivityChooseLocationBinding

class chooseLocation : AppCompatActivity() {
    private lateinit var binding: ActivityChooseLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val locationList = arrayOf("Aligarh","Delhi","Nagpur","Mumbai","Noida","Khair")
        locationList.sort()
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.locate
        autoCompleteTextView.setAdapter(adapter)
    }
}