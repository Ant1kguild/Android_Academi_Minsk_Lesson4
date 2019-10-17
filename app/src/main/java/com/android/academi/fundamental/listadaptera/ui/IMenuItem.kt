package com.android.academi.fundamental.listadaptera.ui

import com.android.academi.fundamental.listadaptera.R

sealed class IMenuItem(open var visibility: Boolean, open val itemId: Int)

data class MIC0routines(
    override var visibility: Boolean = true,
    override val itemId: Int = R.id.item_coroutines
) :
    IMenuItem(visibility, itemId)

data class MIThreadHandler(
    override var visibility: Boolean = true,
    override val itemId: Int = R.id.item_thread_handler
) :
    IMenuItem(visibility, itemId)