package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FilmMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        DefaultMovieService movieService = new DefaultMovieService();
        movieController.setMovieService(movieService);
        FilmMovieRepository movieRepository = new FilmMovieRepository();
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
