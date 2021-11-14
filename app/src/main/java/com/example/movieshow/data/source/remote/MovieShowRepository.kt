package com.example.movieshow.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.data.source.remote.response.ResultsItem

class MovieShowRepository private constructor(private val remoteDataSource: RemoteDataSource) : MovieShowDataSource{
    companion object {
        @Volatile
        private var instance: MovieShowRepository? = null
        fun getInstance(remoteData: RemoteDataSource): MovieShowRepository =
            instance ?: synchronized(this) {
                instance ?: MovieShowRepository(remoteData)
            }
    }

    override fun getMovies(): LiveData<List<MovieEntity>> {
        val movieResult = MutableLiveData<List<MovieEntity>>()

        remoteDataSource.getMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onMoviesLoaded(movies: List<ResultsItem>?) {
                val movieList = ArrayList<MovieEntity>()
                if (movies != null) {
                    Log.d("Jerone", "a: 1")
                    for (response in movies) {
                        with(response) {
//                            val movie = MovieEntity(id, title, overview, posterPath)
//                            movieList.add(movie)
//                            Log.d("Jerone", "${movieList}")
//                            Log.d("Jerone", "${title}")
//                            Log.d("Jerone", "${overview}")
//                            Log.d("Jerone", "${posterPath}")
                            Log.d("Jerone", "a: 2")
                        }
                    }
                    Log.d("Jerone", "a: ${movieList}")
//                    movieResult.setValue(movieList)

                }else{
                    Log.d("Jerone", "a: tidak ada")
                }
            }
        })
        return movieResult
    }
}