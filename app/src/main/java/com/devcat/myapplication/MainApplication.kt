package com.devcat.myapplication

import android.app.Application
import android.util.Log

class MainApplication : Application() {

    override fun onCreate() {
        Log.e("test","hi I am test")
        super.onCreate()

    }
}