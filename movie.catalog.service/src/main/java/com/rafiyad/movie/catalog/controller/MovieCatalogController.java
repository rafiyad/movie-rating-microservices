package com.rafiyad.movie.catalog.controller;

import com.rafiyad.movie.catalog.entity.CatalogItem;
import com.rafiyad.movie.catalog.entity.Movie;
import com.rafiyad.movie.catalog.entity.MovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/catalogs")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String hello() {
        return "Movie Catalog Service is up and running on port 9090";
    }
    // Get all rated movies for a user
    // For each movie, return the movie name, description, and rating.
    // Put them all together and return as a list of CatalogItem


    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogs(@PathVariable String userId) {

        restTemplate.getForObject("http://localhost:9091/movies/" + userId, Movie.class);

        List<MovieRating> ratings = new ArrayList<>(
                List.of(
                        new MovieRating("101", "4"),
                        new MovieRating("102", "5"),
                        new MovieRating("103", "3")));

        return ratings.stream()
                .map(r -> {
                    Movie movie = restTemplate.getForObject("http://localhost:9091/movies/" + r.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(), movie.getDescription(), r.getRating());
                })
                .collect(Collectors.toList());

    }

}
