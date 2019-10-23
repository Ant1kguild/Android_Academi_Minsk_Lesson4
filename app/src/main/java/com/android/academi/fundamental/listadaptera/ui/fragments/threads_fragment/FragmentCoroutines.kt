package com.android.academi.fundamental.listadaptera.ui.fragments.threads_fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.FragmentThreadsBinding
import com.android.academi.fundamental.listadaptera.ui.StartActivity
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext


class FragmentCoroutines : Fragment(), CoroutineScope {

    private lateinit var binding: FragmentThreadsBinding
    private var job: Job? = null

    override val coroutineContext: CoroutineContext
        get() = SupervisorJob()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_threads, container, false)

        binding.btnCreate.setOnClickListener {
            job = launch(context = Dispatchers.IO, start = CoroutineStart.LAZY) {
                repeat(10) { counter ->
                    setText(counter.toString())
                    delay(500L)
                }
                setText("Done")
            }
            setText("Job create")
        }

        binding.btnStart.setOnClickListener {
            job?.start()
        }

        binding.btnCancel.setOnClickListener {
            job?.cancel()
        }

        (activity as StartActivity).setToolbarTitle(TOOLBAR_TITLE)

        return binding.root
    }

    private fun setText(text: String) {
        launch(Dispatchers.Main) {
            binding.tvThreadText.text = text
        }

    }

    companion object {
        private const val TOOLBAR_TITLE = "Coroutines"
    }
}