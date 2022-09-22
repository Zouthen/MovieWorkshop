package com.example.movieworkshop.services;

import com.example.movieworkshop.model.Movie;
import com.example.movieworkshop.repository.MovieRepository;

public class MovieService {

    private MovieRepository moviesrepo;

    public MovieService(){
        this.moviesrepo = new MovieRepository();
    }

    public Movie getFirst(){
        return moviesrepo.getOne(0);
    }

    public Movie getRandom(){
        return moviesrepo.getOne((int) (Math.random() * moviesrepo.getAll().size()));
    }

}
