package com.example.movieapp

import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: MovieClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindMovies(movie: Movie)
    {
        cardCellBinding.poster.setImageResource(movie.poster)
        cardCellBinding.title.text = movie.title
        cardCellBinding.director.text = movie.director

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(movie)
        }
    }
}