package com.example.movieshow.viewmodel

import androidx.lifecycle.ViewModel
import com.example.movieshow.data.TvEntity
import com.example.movieshow.utils.DataDummy

class DetailTvshowViewModel:  ViewModel() {
    private lateinit var tvShowId: String

    fun setSelectedTv(tvId: String) {
        this.tvShowId = tvId
    }
    fun getTvshow(): TvEntity {
        lateinit var tv: TvEntity
        val tvEntitas = DataDummy.generateDummyTvShow()
        for (tvEntity in tvEntitas) {
            if (tvEntity.tvshowId == tvShowId) {
                tv = tvEntity
            }
        }
        return tv
    }
}