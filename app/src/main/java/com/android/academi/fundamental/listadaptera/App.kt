package com.android.academi.fundamental.listadaptera

import android.app.Application
import com.android.academi.fundamental.listadaptera.di.androidModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(androidModule))
        }
    }
}