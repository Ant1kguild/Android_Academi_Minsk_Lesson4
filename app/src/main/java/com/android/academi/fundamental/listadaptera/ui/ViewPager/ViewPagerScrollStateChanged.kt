package com.android.academi.fundamental.listadaptera.ui.ViewPager

import androidx.viewpager.widget.ViewPager

class ViewPagerScrollStateChanged(private val pageScrollStateChanged: (Int) -> Unit = {}) : ViewPager.OnPageChangeListener {

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {}

    override fun onPageScrollStateChanged(state: Int) {
        pageScrollStateChanged(state)
    }
}