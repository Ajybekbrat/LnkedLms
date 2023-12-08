package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Movie {

    private String movieName;
    private String year;
    private String genre;
    private LinkedList<Producer> producer;
    private LinkedList<Actors> actors;

    public Movie() {
    }

    public Movie(String movieName, String year, String genre, LinkedList<Producer>producer, LinkedList<Actors> actors) {
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }




    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String name) {
        this.movieName = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public LinkedList<Producer> getProducer() {
        return producer;
    }

    public void setProducer(LinkedList<Producer> producer) {
        this.producer = producer;
    }

    public LinkedList<Actors> getActors() {
        return actors;
    }

    public void setActors(LinkedList<Actors> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + movieName + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", producer='" + producer + '\'' +
                ", actors='" + actors + '\'' +
                '}';
    }
}
