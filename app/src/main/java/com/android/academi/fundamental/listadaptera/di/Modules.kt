package com.android.academi.fundamental.listadaptera.di

import androidx.fragment.app.FragmentManager
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.mvp.StartActivityContract
import com.android.academi.fundamental.listadaptera.mvp.StartActivityPresenter
import com.android.academi.fundamental.listadaptera.ui.StartActivity
import com.android.academi.fundamental.listadaptera.ui.adapters.ListMoviesAdapter
import com.android.academi.fundamental.listadaptera.ui.adapters.ScreenSlidePageAdapter
import com.android.academi.fundamental.listadaptera.ui.fragments.FragmentListMovies
import com.android.academi.fundamental.listadaptera.ui.fragments.FragmentScreenSlide
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

//    scope(named<FragmentScreenSlide>()) {
//        scoped { (fm: FragmentManager, moviesList: MovieListInfo) -> ScreenSlidePageAdapter(fm, moviesList) }
//    }

    factory { (fm: FragmentManager, moviesList: MovieListInfo) -> ScreenSlidePageAdapter(fm, moviesList) }


}