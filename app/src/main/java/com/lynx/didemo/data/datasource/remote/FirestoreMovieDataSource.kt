package com.lynx.didemo.data.datasource.remote

import android.util.Log

class FirestoreMovieDataSource : RemoteMovieDataSource {
    override fun getRemoteMovies() {
        Log.d("testionel", "get remote movies $this")
    }
}