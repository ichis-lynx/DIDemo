package com.lynx.didemo.presentation.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.lynx.didemo.R
import com.lynx.didemo.presentation.home.HomeActivity

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.aaa()

        findViewById<Button>(R.id.openHomeBtn).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}