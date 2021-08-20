package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();

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
