package com.android.academi.fundamental.listadaptera.mvp

import com.android.academi.fundamental.listadaptera.data.MovieListInfo


interface StartActivityContract {
    interface Presenter : BasePresenter<View>

    interface View : BaseView<Presenter>
}

class StartActivityPresenter(
    override var view: StartActivityContract.View,
    private val moviesList: MovieListInfo
) : StartActivityContract.Presenter {



    override fun onCreate() {
    }

    override fun onDestroy() {
    }



}