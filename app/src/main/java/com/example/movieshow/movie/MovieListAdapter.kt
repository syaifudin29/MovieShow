package com.example.movieshow.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.movieshow.R
import com.example.movieshow.data.MovieEntity
import com.example.movieshow.databinding.ItemsMovieBinding
import com.example.movieshow.detail.DetailActivity

class MovieListAdapter: RecyclerView.Adapter<MovieListAdapter.MoviesViewHolder>() {

    private var listMovies = ArrayList<MovieEntity>()

    fun setMoview(movieses: List<MovieEntity>?){
        if (movieses == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movieses)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieListAdapter.MoviesViewHolder {
        val itemsMoviesBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MovieListAdapter.MoviesViewHolder, position: Int) {
        val moview = listMovies[position]
        holder.bind(moview)
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }
    class MoviesViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: MovieEntity) {
            with(binding) {
                tvItemTitle.text = movies.title
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
//                    intent.putExtra(DetailActivity.EXTRA_COURSE, movies.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movies.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}