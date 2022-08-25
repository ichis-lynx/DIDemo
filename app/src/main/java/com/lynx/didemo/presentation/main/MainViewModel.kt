package com.lynx.didemo.presentation.main

import androidx.lifecycle.ViewModel
import com.lynx.didemo.di.DependencyInjector

class MainViewModel {
    private val movieRepository = DependencyInjector.provideMovieRepository()

    fun aaa() {
        movieRepository.getMovies()
    }
}