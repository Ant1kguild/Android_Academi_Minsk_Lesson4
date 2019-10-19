package com.android.academi.fundamental.listadaptera.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.databinding.FragmentScreenSlideBinding
import com.android.academi.fundamental.listadaptera.ui.StartActivity
import com.android.academi.fundamental.listadaptera.ui.ViewPager.ViewPagerOnPageSelected
import com.android.academi.fundamental.listadaptera.ui.adapters.ScreenSlidePageAdapter
import org.koin.android.ext.android.get
import org.koin.core.KoinComponent

class FragmentScreenSlide : Fragment(), KoinComponent {


    private lateinit var binding: FragmentScreenSlideBinding
    private lateinit var viewPagerAdapter: ScreenSlidePageAdapter
    private val movieListInfo: MovieListInfo = get()




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
        binding.vpScreenSlideFragment.addOnPageChangeListener(ViewPagerOnPageSelected(this@FragmentScreenSlide::onPageSelected))

        if (binding.vpScreenSlideFragment.currentItem != position) {
            binding.vpScreenSlideFragment.currentItem = position
        }
        if (binding.vpScreenSlideFragment.currentItem == 0) {
            (activity as StartActivity).setToolbarTitle(movieListInfo.getPosition(0).title)
        }
        return binding.root
    }

    private fun onPageSelected(position: Int) {
        (activity as StartActivity).setToolbarTitle(movieListInfo.getPosition(position).title)

    }


}


