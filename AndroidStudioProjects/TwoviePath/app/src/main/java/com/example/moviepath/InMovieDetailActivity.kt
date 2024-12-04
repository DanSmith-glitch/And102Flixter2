package com.example.moviepath

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class InMovieDetailActivity : AppCompatActivity() {
    private lateinit var moviePoster: ImageView
    private lateinit var movieTitle: TextView
    private lateinit var movieOverview: TextView
    private lateinit var movieRelease: TextView
    private lateinit var movieRating: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_page)

        moviePoster = findViewById(R.id.movie_poster)
        movieTitle = findViewById(R.id.movie_title)
        movieOverview = findViewById(R.id.movie_overview)
        movieRelease = findViewById(R.id.movie_release)
        movieRating = findViewById(R.id.movie_rating)

        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as InMovie
        Log.d("InMovieDetailActivity", "Movie object: $movie")


        movieTitle.text = movie.title
        movieOverview.text = movie.overview
        movieRelease.text = movie.release
        movieRating.rating = movie.rating!!.toFloat()

        if (movie != null) {
            findViewById<TextView>(R.id.movie_title).text = movie.title
            findViewById<TextView>(R.id.movie_overview).text = movie.overview
            findViewById<TextView>(R.id.movie_release).text = movie.release
            findViewById<TextView>(R.id.movie_rating).text = movie.rating

        } else {
            Log.e("InMovieDetailActivity", "Movie object is null")
        }


        Glide.with(this)
            .load(movie.poster)
            .into(moviePoster)
    }
}