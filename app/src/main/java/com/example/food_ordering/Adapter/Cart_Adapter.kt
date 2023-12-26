package com.example.food_ordering.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.food_ordering.databinding.RecCartBinding
import kotlin.coroutines.coroutineContext

class Cart_Adapter(private val cartItems: MutableList<String>
,private val cartPrices: MutableList<String>
,private val cartImages:MutableList<Int> ) : RecyclerView.Adapter<Cart_Adapter.cart_adapterViewHolder>() {

    private val itemQuantities = IntArray(cartItems.size){1}
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Cart_Adapter.cart_adapterViewHolder {
        val binding = RecCartBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return cart_adapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Cart_Adapter.cart_adapterViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    inner class cart_adapterViewHolder(private val binding: RecCartBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantities[position]
                recCartName.text = cartItems[position]
                recCartPrice.text = cartPrices[position]
                recCartImg.setImageResource(cartImages[position])
                recCartQuant.text = quantity.toString()

                minus.setOnClickListener {
                    decrease(position)
                }
                plus.setOnClickListener {
                    increase(position)
                }
                delete.setOnClickListener {
                    deletee(position)
                }
            }
        }
        private fun decrease(position: Int){
            if(itemQuantities[position]>1){
                itemQuantities[position]--;
                binding.recCartQuant.setText(itemQuantities[position].toString())
            }else{
                deletee(position)
            }
        }
        private fun increase(position: Int){
            if(itemQuantities[position]<10){
                itemQuantities[position]++;
                binding.recCartQuant.setText(itemQuantities[position].toString())
            }else{
                Toast.makeText(itemView.context,"Max Limit Reached", Toast.LENGTH_SHORT).show()
            }
        }
        private fun deletee(position: Int){
            cartItems.removeAt(position)
            cartImages.removeAt(position)
            cartPrices.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,cartItems.size)
        }

    }
}