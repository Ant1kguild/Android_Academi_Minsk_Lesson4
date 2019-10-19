package com.android.academi.fundamental.listadaptera.ui

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.android.academi.fundamental.listadaptera.R
import com.android.academi.fundamental.listadaptera.databinding.ActivityStartBinding
import com.android.academi.fundamental.listadaptera.mvp.StartActivityContract
import org.koin.android.ext.android.get
import org.koin.androidx.scope.currentScope
import org.koin.core.parameter.parametersOf

class StartActivity : AppCompatActivity(), StartActivityContract.View {


    override val presenter by currentScope.inject<StartActivityContract.Presenter> {
        parametersOf(
            this, get()
        )
    }
    private lateinit var binding: ActivityStartBinding
    private lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)
        navHost = NavHostFragment.create(R.navigation.navigation)
        binding.tbSelectItem.title = ""
        setSupportActionBar(binding.tbSelectItem)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_coroutines -> {
                Toast.makeText(this, "Item coroutines pressed", Toast.LENGTH_LONG).show()
            }
            R.id.item_thread_handler -> {
                Toast.makeText(this, "Item thread handler pressed", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun setToolbarTitle(newTitle: String) {
        binding.tbSelectItem.title = newTitle
    }


}
