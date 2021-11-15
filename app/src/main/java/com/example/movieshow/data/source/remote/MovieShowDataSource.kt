package com.example.movieshow.data.source.remote

import androidx.lifecycle.LiveData
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.data.TvEntity

interface MovieShowDataSource {
    fun getMovies(): LiveData<List<MovieEntity>>
    fun getTvs(): LiveData<List<TvEntity>>
}