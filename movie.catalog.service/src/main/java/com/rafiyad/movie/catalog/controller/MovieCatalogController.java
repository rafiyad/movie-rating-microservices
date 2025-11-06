package com.rafiyad.movie.catalog.controller;

import com.rafiyad.movie.catalog.entity.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalogs")
public class MovieCatalogController {
    @GetMapping
    public String hello() {
        return "Movie Catalog Service is up and running on port 9090";
    }

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogs(@PathVariable String userId) {
        List<CatalogItem> catalogItems = Collections.singletonList(
                new CatalogItem("101", "Don", "4")
        );
        return catalogItems;
    }

}
