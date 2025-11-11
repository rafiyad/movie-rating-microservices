package com.rafiyad.movie.info.service;

import com.rafiyad.movie.info.service.entiry.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MovieInfoApplication {

	public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MovieInfoApplication.class, args);

    }

}
