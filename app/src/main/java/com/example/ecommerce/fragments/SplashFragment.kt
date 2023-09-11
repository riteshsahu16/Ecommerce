package com.example.ecommerce.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.ecommerce.R
import com.example.ecommerce.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private lateinit var binding:FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater)

        Handler(Looper.getMainLooper()).postDelayed({
            if(isOnboardingFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
            }
        },3000)
        val anim  = AnimationUtils.loadAnimation(binding.root.context, R.anim.zoom_out)
        //binding.imgLogo.animation = anim
        binding.imgLogo.startAnimation(anim)

        return binding.root
    }

    private fun isOnboardingFinished():Boolean{
        val sharedPrefrences = requireActivity().getSharedPreferences("onBoardingPref", Context.MODE_PRIVATE)
        return sharedPrefrences.getBoolean("isFinished", false)
    }
}

