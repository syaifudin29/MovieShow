package com.example.movieshow.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.movieshow.R
import com.example.movieshow.data.TvEntity
import com.example.movieshow.databinding.ItemsTvBinding
import com.example.movieshow.detail.DetailActivity
import com.example.movieshow.detail.DetailTvActivity


class TvshowListAdapter: RecyclerView.Adapter<TvshowListAdapter.TvshowViewHolder>()  {
    private var listTvshow = ArrayList<TvEntity>()


    fun setMoview(tv: List<TvEntity>?){
        if (tv == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tv)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvshowListAdapter.TvshowViewHolder {
        val itemTvshowListAdapter = ItemsTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvshowViewHolder(itemTvshowListAdapter)
    }

    override fun onBindViewHolder(holder: TvshowListAdapter.TvshowViewHolder, position: Int) {
        val moview = listTvshow[position]
        holder.bind(moview)
    }

    override fun getItemCount(): Int {
        return listTvshow.size
    }

    class TvshowViewHolder(private val binding: ItemsTvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: TvEntity) {
            with(binding) {
                tvItemTitleTv.text = tv.judul
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_COURSE, tv.tvshowId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tv.gambar)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPosterTv)
            }
        }
    }

}