package com.rafiyad.movie.rating.service.controller;

import com.rafiyad.movie.rating.service.entity.MovieRating;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping
    public String hello() {
        return "Movie Rating Service is up and running on port 9092";
    }

    @GetMapping("/{movieId}")
    public MovieRating getMovieRating(@PathVariable String movieId) {
        return new MovieRating(movieId, "5");
    }

    @GetMapping("/{userId}")
    public List<MovieRating> getUserRating(@PathVariable String userId) {
        List<MovieRating> ratings = new ArrayList<>(
                List.of(
                        new MovieRating("101", "4"),
                        new MovieRating("102", "5"),
                        new MovieRating("103", "3")));

        return ratings;
    }
}
