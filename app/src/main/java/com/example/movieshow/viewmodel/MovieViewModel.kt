package com.example.movieshow.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.data.source.remote.MovieShowRepository
import com.example.movieshow.data.source.remote.api.ApiConfig
import com.example.movieshow.data.source.remote.response.MovieResponse
import com.example.movieshow.data.source.remote.response.ResultsItem
import com.example.movieshow.utils.DataDummy
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel(private val movieShowRepository: MovieShowRepository): ViewModel() {
    fun getMovies() = movieShowRepository.getMovies()
}