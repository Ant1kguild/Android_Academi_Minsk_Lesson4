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

class FragmentScreenSlide : Fragment() {
    private lateinit var binding: FragmentScreenSlideBinding
    private lateinit var viewPagerAdapter: ScreenSlidePageAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_screen_slide, container, false)

        viewPagerAdapter = ScreenSlidePageAdapter(childFragmentManager)
        binding.vpScreenSlideFragment.adapter = viewPagerAdapter

        return binding.root
    }


}


