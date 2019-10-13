package com.android.academi.fundamental.listadaptera.di

import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.mvp.StartActivityContract
import com.android.academi.fundamental.listadaptera.mvp.StartActivityPresenter
import com.android.academi.fundamental.listadaptera.ui.StartActivity
import com.android.academi.fundamental.listadaptera.ui.adapters.ListMoviesAdapter
import com.android.academi.fundamental.listadaptera.ui.fragments.FragmentListMovies
import org.koin.core.qualifier.named
import org.koin.dsl.module

val androidModule = module {

    single { MovieListInfo() }

    scope(named<StartActivity>()) {
        scoped { (view: StartActivityContract.View, moviesList: MovieListInfo) ->
            StartActivityPresenter(
                view, moviesList
            ) as StartActivityContract.Presenter
        }

    }

    scope(named<FragmentListMovies>()) {
        scoped { ListMoviesAdapter(get()) }
    }


}