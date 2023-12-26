package com.example.food_ordering.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.food_ordering.Adapter.Cart_Adapter
import com.example.food_ordering.Adapter.PopularAdapter
import com.example.food_ordering.R
import com.example.food_ordering.databinding.FragmentCartBinding

class CartFragment : Fragment() {
private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater,container,false)
//
//        val items = listOf("Burger","Sandwich","Fruit Salad","Green Noddle","Burger","Sandwich","Fruit Salad","Green Noddle")
//        val prices = listOf("5","5","5","5","5","5","5","5")
//        val images = listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4)
//
//        val adapter = Cart_Adapter(ArrayList(items), ArrayList(prices),ArrayList(images))
//        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        binding.recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val items = listOf("Burger","Sandwich","Fruit Salad","Green Noddle","Burger","Sandwich","Fruit Salad","Green Noddle")
        val prices = listOf("5","5","5","5","5","5","5","5")
        val images = listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4)

        val adapter = Cart_Adapter(ArrayList(items), ArrayList(prices),ArrayList(images))
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }

}