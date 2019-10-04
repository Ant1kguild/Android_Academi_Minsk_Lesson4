package com.android.academi.fundamental.listadaptera.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.android.academi.fundamental.listadaptera.data.MovieInfo
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.databinding.ItemListMoviesBinding
import com.bumptech.glide.Glide

@BindingAdapter("setImageGlide")
fun setImage(imageView: ImageView, urlImage: String) {
    Glide
        .with(imageView.context)
        .load(urlImage)
        .centerInside()
        .into(imageView)
}


class ListMoviesAdapter(private val allMovies: List<MovieInfo> = MovieListInfo().getAllMovies()) :
    RecyclerView.Adapter<ListMoviesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListMoviesBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(allMovies[position])
    }

    override fun getItemCount(): Int = allMovies.size


    inner class ViewHolder(private val binding: ItemListMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieInfo) {
            binding.modelMovieInfo = movie
            binding.executePendingBindings()
        }

    }


}