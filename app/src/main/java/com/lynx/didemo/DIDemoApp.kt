package com.lynx.didemo

import android.app.Application
import android.content.Context
import com.lynx.didemo.di.DependencyInjector

class DIDemoApp : Application() {


    override fun onCreate() {
        super.onCreate()

        DependencyInjector.initApplicationContext {
            applicationContext
        }

        DependencyInjector.initApplicationContext(object : DependencyInjector.ContextProvider {
            override fun provideContext(): Context {
                return applicationContext
            }
        })
    }
}