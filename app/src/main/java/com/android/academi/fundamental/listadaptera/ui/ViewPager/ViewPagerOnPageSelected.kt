package com.android.academi.fundamental.listadaptera.ui.ViewPager

import androidx.viewpager.widget.ViewPager

class ViewPagerOnPageSelected(private val pageSelected: (Int) -> Unit = {}) : ViewPager.OnPageChangeListener {

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {
        pageSelected(position)
    }

    override fun onPageScrollStateChanged(state: Int) {}
}