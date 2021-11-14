package com.example.movieshow.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movieshow.data.TvEntity
import com.example.movieshow.utils.DataDummy

class TvshowViewModel: ViewModel() {
    fun getTvshow(): List<TvEntity> = DataDummy.generateDummyTvShow()
}