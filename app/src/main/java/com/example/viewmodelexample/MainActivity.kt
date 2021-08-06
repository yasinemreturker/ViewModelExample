package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel : MainAcitivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainAcitivityViewModel::class.java)

        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
        }
    }
}