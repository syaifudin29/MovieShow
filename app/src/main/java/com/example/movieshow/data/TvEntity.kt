package com.example.movieshow.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvEntity (
    var id: Int,
    var name: String,
    var overview: String,
    var posterPath: String
):Parcelable