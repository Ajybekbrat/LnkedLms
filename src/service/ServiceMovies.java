package service;

import models.Actors;
import models.Movie;

import java.util.ArrayList;
import java.util.LinkedList;

public interface ServiceMovies {
    ArrayList<Movie> getAllMovies();
    ArrayList<Movie>findMovieByNameOrPartName(String name);
    ArrayList<Movie>findMovieByActorName(String actorName);
    ArrayList<Movie>findMovieByYear(String year);
    ArrayList<Movie>findMovieByProducer(String producerName);
    ArrayList<Movie>findMovieByGenre(String genre);
    ArrayList<Actors>findMovieByRole(String role);
   LinkedList<Movie> sortByMovienName(String answer);

    LinkedList<Movie> sortByMovienYear();
}
