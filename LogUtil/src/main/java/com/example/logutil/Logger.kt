package com.example.logutil

import android.util.Log

class Logger {

    fun debug(messageString: String){
        Log.d("Log-Util-Library", "^^ $messageString ^^")
    }
}