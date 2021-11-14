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
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.databinding.ActivityDetailBinding
import com.example.movieshow.utils.DataDummy
import com.example.movieshow.viewmodel.DetailMovieViewModel

class DetailActivity : AppCompatActivity() {

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
        )[DetailMovieViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_COURSE)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                tampil(viewModel.getMovie() as MovieEntity)
                for (movie in DataDummy.generateDummyMoview()) {
                    if (movie.movieId == movieId) {
                        tampil(movie)
                        binding.btnSHare.setOnClickListener(View.OnClickListener {
                            val shareIntent = Intent()
                            shareIntent.action = Intent.ACTION_SEND
                            shareIntent.type="text/plain"
                            shareIntent.putExtra(Intent.EXTRA_TEXT, movie.judul);
                            startActivity(Intent.createChooser(shareIntent,"Share via"))
                        })
                    }
                }
            }
        }
        }

        private fun tampil(movieEntity: MovieEntity) {
            binding.juduldetail.text = movieEntity.judul
            binding.deskripsidetail.text = movieEntity.keterangan

            Glide.with(this)
                .load(movieEntity.gambar)
                .transform(RoundedCorners(20))
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(binding.imgPosterDetail)
        }



}