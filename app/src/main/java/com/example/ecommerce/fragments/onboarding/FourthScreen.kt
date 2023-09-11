package com.example.ecommerce.fragments.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.ecommerce.R
import com.example.ecommerce.databinding.FragmentFourthScreenBinding
import com.example.ecommerce.databinding.FragmentThirdScreenBinding

class FourthScreen : Fragment() {
    private lateinit var binding:FragmentFourthScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFourthScreenBinding.inflate(layoutInflater)
        var pager = activity?.findViewById<ViewPager2>(R.id.onboard_pager)
        binding.txtNext.setOnClickListener{
           findNavController().navigate(R.id.action_onboardingFragment_to_homeFragment )
            isOnboardingFinished()
        }
        return binding.root
    }

    private fun isOnboardingFinished(){
        val sharedPrefrences = requireActivity().getSharedPreferences("onBoardingPref", Context.MODE_PRIVATE)
        val editor = sharedPrefrences.edit()
        editor.putBoolean("isFinished", true )
        editor.apply()
    }


}