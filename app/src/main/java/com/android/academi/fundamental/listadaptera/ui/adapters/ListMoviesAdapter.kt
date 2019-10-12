package com.android.academi.fundamental.listadaptera.ui.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.android.academi.fundamental.listadaptera.data.MovieInfo
import com.android.academi.fundamental.listadaptera.data.MovieListInfo
import com.android.academi.fundamental.listadaptera.databinding.ItemListMoviesBinding
import com.android.academi.fundamental.listadaptera.ui.fragments.FragmentListMoviesDirections
import com.bumptech.glide.Glide
import com.jakewharton.rxbinding3.view.clicks
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

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

    private val visibilityDisposable: CompositeDisposable = CompositeDisposable()




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemListMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(allMovies[position])
        holder.setClick(position)
    }

    override fun getItemCount(): Int = allMovies.size


    inner class ViewHolder(private val binding: ItemListMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieInfo) {
            binding.modelMovieInfo = movie
            binding.executePendingBindings()
        }

        private fun clicks(): Observable<Unit> {
            return binding.containerItemListMovies.clicks()
        }

        fun setClick(pos: Int) {

            visibilityDisposable.add(
                clicks()
                    .subscribe(
                        {
                            val action = FragmentListMoviesDirections.actionFragmentListMoviesToFragmentScreenSlide(pos)
                            findNavController(binding.root).navigate(action)

                        },
                        { Log.e("123", "some error") },
                        { Log.e("123", "On Complite") })
            )


        }

    }


}