package com.example.movieworkshop.controller;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private MovieService movieService;

    public MovieController(){
        this.movieService = new MovieService();
    }

    @GetMapping("/getfirst")
    public Movie getFirst(){
        return movieService.getFirst();
    }

    @GetMapping("/getrandom")
    public Movie getRandom(){
        return movieService.getRandom();
    }
}
