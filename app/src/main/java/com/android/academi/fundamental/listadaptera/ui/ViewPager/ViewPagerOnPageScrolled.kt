package com.android.academi.fundamental.listadaptera.ui.ViewPager

import androidx.viewpager.widget.ViewPager

class ViewPagerOnPageScrolled(private val pageScrolled: (Int, Float, Int) -> Unit = { _, _, _ -> }) : ViewPager.OnPageChangeListener {

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        pageScrolled(position, positionOffset, positionOffsetPixels)
    }

    override fun onPageSelected(position: Int) {}

    override fun onPageScrollStateChanged(state: Int) {}
}