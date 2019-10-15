package com.android.academi.fundamental.listadaptera.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.data.MovieInfo
import com.android.academi.fundamental.listadaptera.databinding.FragmentMoviesDetailsBinding

class FragmentMovieDetails : Fragment() {
    private lateinit var binding: FragmentMoviesDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.fragment_movies_details,
            container,
            false
        )
        binding.movie = arguments!!.getParcelable(ARGS_MOVIE)



        return binding.root
    }

    companion object {

        private const val ARGS_MOVIE = "ARGS_MOVIE"

        fun newInstance(movie: MovieInfo): FragmentMovieDetails {
            val fragment = FragmentMovieDetails()
            val bundle = Bundle()
            bundle.putParcelable(ARGS_MOVIE, movie)
            fragment.arguments = bundle
            return fragment
        }
    }
}