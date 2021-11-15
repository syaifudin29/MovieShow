package com.example.movieshow.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.data.TvEntity
import com.example.movieshow.data.source.remote.response.ResultsItem
import com.example.movieshow.data.source.remote.response.ResultsItemv

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
                    for (response in movies) {
                        with(response) {
                            val movie = MovieEntity(id, title, overview, posterPath)
                            movieList.add(movie)
                        }
                    }
                    movieResult.postValue(movieList)
                }
            }
        })

        return movieResult
    }

    override fun getTvs(): LiveData<List<TvEntity>> {
        val tvResult = MutableLiveData<List<TvEntity>>()

        remoteDataSource.getTvs(object : RemoteDataSource.LoadTvCallback {
            override fun onTvLoaded(tv: List<ResultsItemv>?) {
                val tvList = ArrayList<TvEntity>()
                if (tv != null) {
                    for (response in tv) {
                        with(response) {
                            val tvs = TvEntity(id, name, overview, posterPath)
                            tvList.add(tvs)
                            Log.d("gambar", "${posterPath}")
                        }
                    }
                    tvResult.postValue(tvList)
                }
            }
        })

        return tvResult
    }
}