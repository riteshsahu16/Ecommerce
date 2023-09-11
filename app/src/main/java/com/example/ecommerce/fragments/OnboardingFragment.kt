package com.example.ecommerce.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerce.databinding.FragmentOnboardingBinding
import com.example.ecommerce.fragments.onboarding.FirstScreen
import com.example.ecommerce.fragments.onboarding.FourthScreen
import com.example.ecommerce.fragments.onboarding.SecondScreen
import com.example.ecommerce.fragments.onboarding.ThirdScreen
import com.example.ecommerce.utils.ViewPagerAdapter

class OnboardingFragment : Fragment() {
    private lateinit var binding:FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentOnboardingBinding.inflate(layoutInflater)
        val springDotsIndicator = binding.dotsIndicator
        val fragmentList = listOf(FirstScreen(), SecondScreen(), ThirdScreen(), FourthScreen())
        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle )
        binding.onboardPager.adapter = adapter
        springDotsIndicator.attachTo(binding.onboardPager)
        return binding.root
    }

}