package com.lynx.didemo.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lynx.didemo.R

class HomeActivity : AppCompatActivity() {
    private val viewModel = HomeViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewModel.aaa()
    }
}