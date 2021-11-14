package com.example.movieshow.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class MovieViewModelTest : TestCase() {

    private lateinit var viewModel: MovieViewModel

    @Before
    override fun setUp(){
        viewModel = MovieViewModel()
    }

    @Test
    fun testGetMovies() {
        val movieEntitas = viewModel.getMovies()
        assertNotNull(movieEntitas)
        assertEquals(10, movieEntitas.size)
    }
}