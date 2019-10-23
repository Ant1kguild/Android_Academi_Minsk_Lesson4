package com.android.academi.fundamental.listadaptera.ui.fragments.threads_fragment

interface TaskEventsListener {

    fun onPreExecute()
    fun onPostExecute()
    fun onProgressUpdate(progress: Int)

}