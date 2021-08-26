package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Saisissez le titre du film à ajouter : " );
        String title = sc.nextLine();
        System.out.println( "Saisissez le genre du film à ajouter : " );
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        movieService.registerMovie(movie);
    }

}
