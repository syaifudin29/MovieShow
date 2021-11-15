package com.example.movieshow.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movieshow.data.TvEntity
import com.example.movieshow.data.source.remote.MovieShowRepository
import com.example.movieshow.utils.DataDummy

class TvshowViewModel(private val movieShowRepository: MovieShowRepository): ViewModel() {
    fun getTv() = movieShowRepository.getTvs()
}