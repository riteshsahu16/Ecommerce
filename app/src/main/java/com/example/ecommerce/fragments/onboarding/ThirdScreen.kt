package com.example.ecommerce.fragments.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.ecommerce.R
import com.example.ecommerce.databinding.FragmentSecondScreenBinding
import com.example.ecommerce.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
   private lateinit var binding : FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdScreenBinding.inflate(layoutInflater)
        var pager = activity?.findViewById<ViewPager2>(R.id.onboard_pager)
        binding.txtNext.setOnClickListener{
            pager?.currentItem = 3
        }
        return binding.root
    }

}