package com.example.movieshow.data.source.remote

import androidx.lifecycle.LiveData
import com.example.movieshow.data.MovieEntity

interface MovieShowDataSource {
    fun getMovies(): LiveData<List<MovieEntity>>
}