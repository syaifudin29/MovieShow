package com.example.movieshow.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.utils.DataDummy

class MovieViewModel: ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMoview()
}