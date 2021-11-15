package com.example.movieshow.data.source.remote.api


import com.example.movieshow.BuildConfig
import com.example.movieshow.data.source.remote.response.MovieResponse
import com.example.movieshow.data.source.remote.response.TvResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("movie/popular")
    fun getMovies(
        @Query("api_key") apikey: String = BuildConfig.API_KEY
    ): Call<MovieResponse>

    @GET("tv/popular")
    fun getTVs(
        @Query("api_key") apikey: String = BuildConfig.API_KEY
    ): Call<TvResponse>


}