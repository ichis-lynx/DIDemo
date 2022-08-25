package com.lynx.didemo.di

import android.content.Context
import com.lynx.didemo.data.datasource.local.MovieDao
import com.lynx.didemo.data.datasource.local.MovieRoomDb

object RoomModule {

    private lateinit var applicationContext: () -> Context


    fun initApplicationContext(provideContext: () -> Context) {
        this.applicationContext = provideContext
    }


    private fun provideMovieRoomDatabase() = MovieRoomDb(applicationContext())

    fun provideMovieDao(): MovieDao = provideMovieRoomDatabase().getMovieDao()
}