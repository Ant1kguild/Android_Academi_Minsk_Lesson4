package com.android.academi.fundamental.listadaptera.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.android.academi.fundamental.listadaptera.data.MovieInfo
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.ui.fragments.FragmentMovieDetails

class ScreenSlidePageAdapter(fa: FragmentManager,
                             private val movieList: List<MovieInfo> = MovieListInfo().getAllMovies()) :
    FragmentStatePagerAdapter(fa)  {


    override fun getCount(): Int {
        return  movieList.size
    }

    override fun getItem(position: Int): Fragment {
        return FragmentMovieDetails.newInstance(movieList[position])
    }
}


