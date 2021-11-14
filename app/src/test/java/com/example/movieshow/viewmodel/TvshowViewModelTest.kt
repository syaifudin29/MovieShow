package com.example.movieshow.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class TvshowViewModelTest : TestCase(){
    private lateinit var viewModel: TvshowViewModel

    @Before
    override fun setUp(){
        viewModel = TvshowViewModel()
    }

    @Test
    fun testGetTvshow() {
        val tvEntitas = viewModel.getTvshow()
        assertNotNull(tvEntitas)
        assertEquals(10, tvEntitas.size)
    }
}