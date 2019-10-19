package com.android.academi.fundamental.listadaptera.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.data.MovieInfo
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.databinding.FragmentMoviesDetailsBinding
import com.android.academi.fundamental.listadaptera.ui.StartActivity

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

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            arguments!!.getString(ARGS_MOVIE_TITLE)?.let {
                (activity as StartActivity).setToolbarTitle(
                    it
                )
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_items, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    companion object {
        private const val ARGS_MOVIE = "ARGS_MOVIE"
        private const val ARGS_MOVIE_TITLE = "ARGS MOVIE TITLE"


        fun newInstance(movie: MovieInfo): FragmentMovieDetails {
            val fragment = FragmentMovieDetails()
            val bundle = Bundle()
            bundle.putParcelable(ARGS_MOVIE, movie)
            bundle.putString(ARGS_MOVIE_TITLE, movie.title)
            fragment.arguments = bundle
            return fragment
        }
    }
}