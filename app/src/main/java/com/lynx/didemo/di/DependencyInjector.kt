package com.lynx.didemo.di

import android.content.Context
import com.lynx.didemo.data.datasource.local.LocalMovieDataSource
import com.lynx.didemo.data.datasource.local.MovieDao
import com.lynx.didemo.data.datasource.local.MovieRoomDb
import com.lynx.didemo.data.datasource.local.RoomMovieDataSource
import com.lynx.didemo.data.datasource.remote.FirestoreMovieDataSource
import com.lynx.didemo.data.datasource.remote.RemoteMovieDataSource
import com.lynx.didemo.data.repository.MovieRepositoryImpl
import com.lynx.didemo.domain.MovieRepository

object DependencyInjector {

//    private lateinit var context: Context
//
//    fun initApplicationContext(context: Context) {
//        this.context = context
//    }

    private lateinit var applicationContext: () -> Context
    private lateinit var contextProvider: ContextProvider

    interface ContextProvider {
        fun provideContext(): Context
    }

    fun initApplicationContext(provideContext: () -> Context) {
        applicationContext = provideContext
    }

    fun initApplicationContext(contextProvider: ContextProvider) {
        this.contextProvider = contextProvider
    }


    fun provideLocalMovieDataSource(): LocalMovieDataSource = RoomMovieDataSource(RoomModule.provideMovieDao())

    fun provideRemoteMovieDataSource(): RemoteMovieDataSource = FirestoreMovieDataSource()

    fun provideMovieRepository(): MovieRepository = MovieRepositoryImpl(
        provideLocalMovieDataSource(),
        provideRemoteMovieDataSource()
    )
}