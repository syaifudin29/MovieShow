package com.example.movieshow.viewmodel

import com.example.movieshow.utils.DataDummy
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest : TestCase() {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMoview()[2]
    private val movieId = dummyMovie.movieId

    @Before
    override fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun testGetMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val moviewEntity = viewModel.getMovie()
        assertNotNull(moviewEntity )
        assertEquals(dummyMovie.judul, moviewEntity.judul)
        assertEquals(dummyMovie.gambar, moviewEntity.gambar)
        assertEquals(dummyMovie.keterangan, moviewEntity.keterangan)
        assertEquals(dummyMovie.movieId, moviewEntity.movieId)
    }
}