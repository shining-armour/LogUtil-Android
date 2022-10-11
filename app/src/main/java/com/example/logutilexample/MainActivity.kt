package com.example.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logutil.Logger

class MainActivity : AppCompatActivity() {
    val logger = Logger()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.debug("This is working")

    }
}