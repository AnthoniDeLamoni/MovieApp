package com.example.movieapp

import java.time.Duration
var movieList = mutableListOf<Movie>()

class Movie (
    var poster: Int,
    var title: String,
    var director: String,
    var duration: Int,
    var release: Int,
    var desc: String,
    val id: Int? = movieList.size
    )