package com.example.food_ordering.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView.ScaleType
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.food_ordering.Adapter.PopularAdapter
import com.example.food_ordering.R
import com.example.food_ordering.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root





    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1,scaleType = ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.banner2,scaleType = ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.banner3,scaleType = ScaleTypes.CENTER_CROP))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected image $position"

                Toast.makeText(requireContext(), itemMessage,Toast.LENGTH_SHORT).show()
            }

        })

        val items = listOf("Burger","Sandwich","Fruit Salad","Green Noddle","Burger","Sandwich","Fruit Salad","Green Noddle")
        val prices = listOf("5","5","5","5","5","5","5","5")
        val images = listOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,R.drawable.menu4)

        val adapter = PopularAdapter(items,prices,images)
        binding.popRec.layoutManager= LinearLayoutManager(requireContext())
        binding.popRec.adapter=adapter
    }


}