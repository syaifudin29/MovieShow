package com.example.movieshow.data.source.remote.api


import com.example.movieshow.data.source.remote.response.MovieResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("movie/popular?api_key=d18afbaef4110a28a4a1d5a3238ab047")
    fun getMovies(): Call<MovieResponse>
//        @Path("id") id: String

}