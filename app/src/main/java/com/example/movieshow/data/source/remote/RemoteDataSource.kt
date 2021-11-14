package com.example.movieshow.data.source.remote

import android.telecom.Call
import android.util.Log
import com.example.movieshow.data.source.remote.api.ApiConfig
import com.example.movieshow.data.source.remote.response.MovieResponse
import com.example.movieshow.data.source.remote.response.ResultsItem
import retrofit2.Response
import javax.security.auth.callback.Callback

class RemoteDataSource {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource()
            }
    }

    fun getMovies(callback: LoadMoviesCallback) {
/*        EspressoIdlingResource.increment()*/
        val client = ApiConfig.getApiService().getMovies()
        client.enqueue(object : retrofit2.Callback<MovieResponse> {
            override fun onResponse(call: retrofit2.Call<MovieResponse>, response: Response<MovieResponse>) {
                callback.onMoviesLoaded(response.body()?.results)
//                response.body()?.page
//                EspressoIdlingResource.decrement()
            }

            override fun onFailure(call: retrofit2.Call<MovieResponse>, t: Throwable) {
                Log.e("RemoteDataSource", "getMovies onFailure : ${t.message}")
//                EspressoIdlingResource.decrement()
            }
        })
    }

    interface LoadMoviesCallback {
        fun onMoviesLoaded(movies : List<ResultsItem>?)
    }
}



