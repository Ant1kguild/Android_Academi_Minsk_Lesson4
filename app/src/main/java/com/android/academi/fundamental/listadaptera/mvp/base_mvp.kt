package com.android.academi.fundamental.listadaptera.mvp

interface BasePresenter<T> {
    var view: T
    fun onCreate()
    fun onDestroy()

}

interface BaseView<out T : BasePresenter<*>> {
    val presenter: T
}