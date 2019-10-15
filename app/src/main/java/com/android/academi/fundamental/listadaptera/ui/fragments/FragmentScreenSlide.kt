package com.android.academi.fundamental.listadaptera.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.FragmentScreenSlideBinding
import com.android.academi.fundamental.listadaptera.ui.adapters.ScreenSlidePageAdapter
import org.koin.android.ext.android.get
import org.koin.core.KoinComponent

class FragmentScreenSlide : Fragment(), KoinComponent {
    private lateinit var binding: FragmentScreenSlideBinding
    private lateinit var viewPagerAdapter: ScreenSlidePageAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_screen_slide, container, false)
        val position: Int = arguments?.get("Position") as Int


        viewPagerAdapter = ScreenSlidePageAdapter(childFragmentManager, get())
        binding.vpScreenSlideFragment.adapter = viewPagerAdapter
        binding.vpScreenSlideFragment.currentItem = position

        return binding.root
    }


}


