package com.android.academi.fundamental.listadaptera.ui.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.FragmentListMoviesBinding
import com.android.academi.fundamental.listadaptera.ui.StartActivity
import com.android.academi.fundamental.listadaptera.ui.adapters.ListMoviesAdapter
import com.android.academi.fundamental.listadaptera.ui.callbacks.IToolbar
import org.koin.androidx.scope.currentScope

class FragmentListMovies : Fragment() {
    private lateinit var binding: FragmentListMoviesBinding
    private val listMoviesAdapter by currentScope.inject<ListMoviesAdapter>()


    lateinit var iToolbar: IToolbar

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_movies, container, false)
        binding.rvListMovies.adapter = listMoviesAdapter

        try {
            iToolbar = activity as IToolbar
        } catch (e: ClassCastException) {
            Log.e(TAG,activity.toString() + " must implement onSomeEventListener" )
            throw ClassCastException(activity.toString() + " must implement onSomeEventListener")
        }

        iToolbar.setTitle(toolbarTitle)
        //iToolbar.coroutinesItemShow(false)
        //iToolbar.threadHandlerItemShow(false)
        //(activity as AppCompatActivity).supportActionBar?.title = toolbarTitle


        return binding.root
    }

    companion object {
        private val TAG = FragmentScreenSlide::class.simpleName
        private const val toolbarTitle = "List movies"


    }


}