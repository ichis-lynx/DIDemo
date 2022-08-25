package com.lynx.didemo.data.datasource.local

import android.content.Context
import android.util.Log

class MovieRoomDb(
    val context: Context
) {


    fun getMovieDao(): MovieDao = MovieDaoImpl()


    class MovieDaoImpl : MovieDao {
        override fun getMovies() {
            Log.d("testionel", "get movies from dao")
        }
    }
}