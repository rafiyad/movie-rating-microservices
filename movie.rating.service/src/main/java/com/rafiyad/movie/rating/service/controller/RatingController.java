package com.rafiyad.movie.rating.service.controller;

import com.rafiyad.movie.rating.service.entity.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping
    public String hello() {
        return "Movie Rating Service is up and running on port 9092";
    }

    @GetMapping("/{movieId}")
    public MovieRating getMovieRating(@RequestParam String movieId) {
        return new MovieRating("Inception", "5");
    }
}
