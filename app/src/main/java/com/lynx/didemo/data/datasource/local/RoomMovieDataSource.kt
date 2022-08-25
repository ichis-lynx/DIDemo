package com.lynx.didemo.data.datasource.local

import android.util.Log

class RoomMovieDataSource(
    private val movieDao: MovieDao,
) : LocalMovieDataSource {

    override fun getLocalMovies() {
        Log.d("testionel", "get local movies $this")
        movieDao.getMovies()
    }
}