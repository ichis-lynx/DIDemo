package com.lynx.didemo.data.repository

import android.util.Log
import com.lynx.didemo.data.datasource.local.LocalMovieDataSource
import com.lynx.didemo.data.datasource.remote.RemoteMovieDataSource
import com.lynx.didemo.domain.MovieRepository

class MovieRepositoryImpl(
    private val localMovieDataSource: LocalMovieDataSource,
    private val remoteMovieDataSource: RemoteMovieDataSource
) : MovieRepository {

    override fun getMovies() {
        Log.d("testionel", "repo get movies $this")
        localMovieDataSource.getLocalMovies()
        remoteMovieDataSource.getRemoteMovies()
    }
}