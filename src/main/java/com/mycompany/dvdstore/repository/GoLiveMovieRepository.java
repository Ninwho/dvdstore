package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoLiveMovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        FileWriter writer;
        try{
            writer=new FileWriter("/tmp/movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
            System.out.println("The movie "+movie.getTitle()+" has been added.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
