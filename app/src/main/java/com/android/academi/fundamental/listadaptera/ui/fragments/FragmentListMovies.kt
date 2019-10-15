package com.android.academi.fundamental.listadaptera.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.FragmentListMoviesBinding
import com.android.academi.fundamental.listadaptera.ui.adapters.ListMoviesAdapter
import org.koin.androidx.scope.currentScope

class FragmentListMovies : Fragment() {
    private lateinit var binding: FragmentListMoviesBinding
    private val listMoviesAdapter by currentScope.inject<ListMoviesAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_movies, container, false)
        binding.rvListMovies.adapter = listMoviesAdapter
        return binding.root
    }
}