package com.example.movieshow.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.movieshow.R
import com.example.movieshow.data.TvEntity
import com.example.movieshow.databinding.ActivityDetailBinding
import com.example.movieshow.utils.DataDummy
import com.example.movieshow.viewmodel.DetailTvshowViewModel

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
        )[DetailTvshowViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val tvshowId = extras.getString(DetailActivity.EXTRA_COURSE)
            if (tvshowId != null) {
                viewModel.setSelectedTv(tvshowId)
                tampilTvShow(viewModel.getTvshow() as TvEntity)
                for (tv in DataDummy.generateDummyTvShow()) {
                    if (tv.tvshowId == tvshowId) {
                        tampilTvShow(tv)
                        binding.btnSHare.setOnClickListener(View.OnClickListener {
                            val shareIntent = Intent()
                            shareIntent.action = Intent.ACTION_SEND
                            shareIntent.type="text/plain"
                            shareIntent.putExtra(Intent.EXTRA_TEXT, tv.judul);
                            startActivity(Intent.createChooser(shareIntent,"Share via"))
                        })
                    }
                }
            }
        }
    }

    private fun tampilTvShow(tvEntity: TvEntity) {
        binding.juduldetail.text = tvEntity.judul
        binding.deskripsidetail.text = tvEntity.keterangan

        Glide.with(this)
                .load(tvEntity.gambar)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error)
                )
                .into(binding.imgPosterDetail)
    }
}