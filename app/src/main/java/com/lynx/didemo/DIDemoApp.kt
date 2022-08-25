package com.lynx.didemo

import android.app.Application
import com.lynx.didemo.di.DependencyInjector

class DIDemoApp : Application() {


    override fun onCreate() {
        super.onCreate()

        DependencyInjector.initApplicationContext { this }
    }
}