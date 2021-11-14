package com.example.movieshow.viewmodel

import com.example.movieshow.utils.DataDummy
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class DetaiTvshowlViewModelTest : TestCase() {

    private lateinit var viewModel: DetailTvshowViewModel
    private val dummyTvshow = DataDummy.generateDummyTvShow()[2]
    private val tvshowId = dummyTvshow.tvshowId

    @Before
    override fun setUp() {
        viewModel = DetailTvshowViewModel()
        viewModel.setSelectedTv(tvshowId)
    }

    @Test
    fun testGetTvshow() {
        viewModel.setSelectedTv(dummyTvshow.tvshowId)
        val tvShowEntity = viewModel.getTvshow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvshow.judul, tvShowEntity.judul)
        assertEquals(dummyTvshow.gambar, tvShowEntity.gambar)
        assertEquals(dummyTvshow.keterangan, tvShowEntity.keterangan)
        assertEquals(dummyTvshow.tvshowId, tvShowEntity.tvshowId)
    }

}