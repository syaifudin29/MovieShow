package com.example.movieshow.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.utils.DataDummy

class DetailMovieViewModel: ViewModel() {
    private lateinit var movieId: String


//    fun setSelectedMovie(moviewId: String) {
//        this.movieId = moviewId
//    }

//    fun getMovie(): MovieEntity {
//        lateinit var movie: MovieEntity
//        val movieEntitas = DataDummy.generateDummyMoview()
//        for (movieEntity in movieEntitas) {
//            if (movieEntity.movieId == movieId) {
//                movie = movieEntity
//            }
//        }
//        return movie
//    }

}