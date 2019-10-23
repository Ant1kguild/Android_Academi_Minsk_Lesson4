package com.android.academi.fundamental.listadaptera.ui.fragments.threads_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.FragmentThreadsBinding


class FragmentThreadHandler : Fragment() {
    private lateinit var binding: FragmentThreadsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_threads, container, false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}