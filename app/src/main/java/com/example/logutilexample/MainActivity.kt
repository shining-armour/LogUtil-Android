package com.example.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logutil.Logger
import com.example.newlogutil.NewLogger

class MainActivity : AppCompatActivity() {
    val logger = Logger()
    val newLogger = NewLogger()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.debug("This is working")
        newLogger.error("New library also working")

    }
}