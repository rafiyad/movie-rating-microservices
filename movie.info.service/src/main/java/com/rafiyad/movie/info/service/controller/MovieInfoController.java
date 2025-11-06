package com.rafiyad.movie.info.service.controller;


import com.rafiyad.movie.info.service.entiry.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @GetMapping
    public String hello() {
        return "Movie Catalog Service is up and running on port 9090";
    }


    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
        return new Movie(movieId, "Deception", "About fictional movie");
    }
}
