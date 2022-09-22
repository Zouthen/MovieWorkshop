package com.example.movieworkshop.repository;

import com.example.movieworkshop.model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieRepository {

    private List<Movie> movies;

    public MovieRepository(){
        this.movies = new ArrayList<>();
        generateMovieList();
    }

    private void generateMovieList() {
        // Læs fra csv fil og tilføj hver Movie til listen
        try {
            Scanner input = new Scanner(new File("C:\\Users\\micha\\Desktop\\KEA\\2. Semester\\Programmering\\MovieWorkshop\\resources\\movies.csv"));
            input.useDelimiter(";|\n");

            while (input.hasNext()){

                // Year;Length;Title;Subject;Popularity;Awards
                String year = input.next();
                String length = input.next();
                String title = input.next();
                String subject = input.next();
                String popularity = input.next();
                String awards = input.next();

                Movie mo = new Movie(year,length,title,subject,popularity,awards);

                movies.add(mo);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Movie getOne(int index){
        return movies.get(index);
    }

    public List<Movie> getAll(){
        return movies;
    }


}
