package com.lynx.didemo.presentation.home

import android.util.Log
import com.lynx.didemo.di.DependencyInjector

class HomeViewModel {

    private val movieRepository = DependencyInjector.provideMovieRepository()

    fun aaa() {
        Log.d("testionel", "---------------")
        movieRepository.getMovies()
    }
}