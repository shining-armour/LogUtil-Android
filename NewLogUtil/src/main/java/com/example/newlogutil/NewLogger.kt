package com.example.newlogutil

import android.util.Log

class NewLogger {

    fun error(messageString: String){
        Log.e("New-Log-Util-Library", "-- $messageString --")
    }
}