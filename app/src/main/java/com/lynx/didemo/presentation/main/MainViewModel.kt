package com.lynx.didemo.presentation.main

import androidx.lifecycle.ViewModel
import com.lynx.didemo.di.DependencyInjector
import com.lynx.didemo.domain.MovieRepository

class MainViewModel {
    private val movieRepository: MovieRepository = DependencyInjector.provideMovieRepository()

    fun aaa() {
        movieRepository.getMovies()
    }
}