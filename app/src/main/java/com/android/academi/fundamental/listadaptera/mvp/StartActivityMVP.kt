package com.android.academi.fundamental.listadaptera.mvp

import com.android.academi.fundamental.listadaptera.data.MovieListInfo


interface StartActivityContract{
    interface Presenter : BasePresenter<View>

    interface View : BaseView<Presenter>
}

class StartActivityPresenter(override var view:StartActivityContract.View, private val moviesList: MovieListInfo) : StartActivityContract.Presenter {
    override fun onCreate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}