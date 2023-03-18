package com.example.moviemvvm.data.api

import com.example.moviemvvm.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=a8ba883a8abd40dc6dd1ec0d739c1a1c
    // https://api.themoviedb.org/3/movie/299534?api_key=a8ba883a8abd40dc6dd1ec0d739c1a1c
    // https://api.themoviedb.org/3/

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

}