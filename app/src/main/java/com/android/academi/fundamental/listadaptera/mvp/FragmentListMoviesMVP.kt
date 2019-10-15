package com.android.academi.fundamental.listadaptera.mvp

interface FragmentListMoviesContract {
    interface Presenter:BasePresenter<View>

    interface View:BaseView<Presenter>
}