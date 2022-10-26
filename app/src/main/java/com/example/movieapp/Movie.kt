package com.example.movieapp

import java.time.Duration
var movieList = mutableListOf<Movie>()

val MOVIE_ID_EXTRA = "movieExtra"

class Movie(
    var poster: Int,
    var title: String,
    var director: String,
    var cast: String,
    var release: String,
    var desc: String,
    val id: Int? = movieList.size
)