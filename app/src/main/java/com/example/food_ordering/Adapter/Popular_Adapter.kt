package com.example.food_ordering.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food_ordering.databinding.PopularItemBinding

class PopularAdapter(private val Items: List<String>,private val prices:List<String>, private val images:List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): PopularAdapter.PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularAdapter.PopularViewHolder, position: Int) {
        val item = Items[position]
        val images = images[position]
        val price = prices[position]
        holder.bind(item,price,images)
    }

    override fun getItemCount(): Int {
        return Items.size
    }

    class PopularViewHolder(private val binding: PopularItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: String,price: String, images: Int) {
                binding.recFoodName.setText(item)
                binding.recFoodPrice.setText("$ $price")
                binding.recFoodImg.setImageResource(images)
        }


    }
}