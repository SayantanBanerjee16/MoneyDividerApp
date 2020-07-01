package com.sayantanbanerjee.moneydividerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.sayantanbanerjee.moneydividerapp.databinding.ActivityMainBinding
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.noValueToast.observe(this, Observer {
            Toast.makeText(this, "No field should remain empty", Toast.LENGTH_SHORT).show()
        })

        viewModel.difference.observe(this , Observer {
            if(it == 0){
                binding.display.text = getString(R.string.amountEqual)
            }else if(it > 0){
                binding.display.text = getString(R.string.amount1more) + " " + it.toString()
            }else{
                binding.display.text = getString(R.string.amount2more) + " " + it.absoluteValue.toString()
            }
        })
    }
}
