package com.android.academi.fundamental.listadaptera.ui.callbacks

import com.android.academi.fundamental.listadaptera.ui.IMenuItem
import com.android.academi.fundamental.listadaptera.ui.StartActivity

interface IToolbar {


    fun updateToolbar(
        toolbarTitle: StartActivity.ToolbarSettings.ToolbarTitle,
        menuItemList:List<IMenuItem>    )
}