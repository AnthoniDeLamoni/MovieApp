package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movieapp.databinding.ActivityDetailBinding
import com.example.movieapp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movieID = intent.getIntExtra(MOVIE_ID_EXTRA, -1)
        val movie = movieFromID(movieID)
        if(movie != null)
        {
            binding.poster.setImageResource(movie.poster)
            binding.title.text = movie.title
            binding.director.text = movie.director
            binding.cast.text = movie.cast
            binding.releaseDate.text = movie.release
            binding.description.text = movie.desc
        }
    }

    private fun movieFromID(movieID: Int): Movie?
    {
        for(movie in movieList)
        {
            if(movie.id == movieID)
                return movie
        }
        return null
    }
}