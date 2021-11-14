package com.example.movieshow.di

import android.content.Context
import com.example.movieshow.data.source.remote.MovieShowRepository
import com.example.movieshow.data.source.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): MovieShowRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return MovieShowRepository.getInstance(remoteDataSource)
    }
}