package com.android.academi.fundamental.listadaptera.ui.callbacks

import org.koin.core.KoinComponent

interface IToolbar : KoinComponent {


    fun setToolbarTitle(newTitle: String)

    fun setOptionMenu(newMenuId: Int)


}

