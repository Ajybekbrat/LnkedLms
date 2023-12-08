import models.Actors;
import models.Movie;
import service.ServiceMovies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;



public class MoviesSer implements ServiceMovies {
    DataBase dataBase = new DataBase();
    @Override
    public ArrayList<Movie> getAllMovies() {
        for (Movie movie : dataBase.movies) {
            System.out.println(movie);
        }


        return null;
    }

    @Override
    public ArrayList<Movie> findMovieByNameOrPartName(String name) {
        for (Movie movie : dataBase.movies) {
            if (movie.getMovieName().equalsIgnoreCase(name)) {
                System.out.println(movie);
        }



            }

        return null;
    }

    @Override
    public ArrayList<Movie> findMovieByActorName(String actorName) {
        for (int i = 0; i < dataBase.movies.size(); i++) {
            for (int l = 0; l < dataBase.movies.get(i).getActors().size(); l++) {
                if (dataBase.movies.get(i).getActors().get(l).getFullname().equalsIgnoreCase(actorName)){
                    System.out.println(dataBase.movies.get(i));
                }
            }
        }

        return null;
    }

    @Override
    public ArrayList<Movie> findMovieByYear(String year) {
        for (Movie movie : dataBase.movies) {
            if (movie.getYear().equals(year)){
                System.out.println(movie);

            }
        }
        return null;
    }

    @Override
    public ArrayList<Movie> findMovieByProducer(String producerName) {

        for (int i = 0; i < dataBase.movies.size(); i++) {
            for (int l = 0; l < dataBase.movies.get(i).getProducer().size(); l++) {
                if (dataBase.movies.get(i).getProducer().get(l).getFullName().equalsIgnoreCase(producerName)){
                    System.out.println(dataBase.movies.get(i));
                }
            }
        }
        return null;
    }



    @Override
    public ArrayList<Movie> findMovieByGenre(String genre) {
        for (Movie movie : dataBase.movies) {
            if (movie.getGenre().equals(genre)){
                System.out.println(movie);

            }
        }
        return null;
    }

    @Override
    public ArrayList<Actors> findMovieByRole(String role) {
        for (Movie movie : dataBase.movies) {
            for (int i = 0; i < dataBase.movies.size(); i++) {
                for (int j = 0; j < dataBase.movies.get(i).getActors().size(); j++) {
                    if (dataBase.movies.get(i).getActors().get(j).getRole().equalsIgnoreCase(role)) {
                        System.out.println(dataBase.movies.get(j));

                    }
                }


            }
        }

        return null;
        }
    @Override
    public LinkedList<Movie> sortByMovienName(String answer) {
        Comparator<Movie> comparator = Comparator.comparing(Movie::getMovieName);
        if (answer.equalsIgnoreCase("From A to Z")) {
            dataBase.movies.sort(comparator);
            return dataBase.movies;
        } else if (answer.equalsIgnoreCase("From  Z to A")) {
            dataBase.movies.sort(comparator.reversed());
            return dataBase.movies;
        }
        return null;
    }
    @Override
    public LinkedList<Movie> sortByMovienYear() {
        Comparator<Movie> comparator = Comparator.comparing(Movie::getYear);

            dataBase.movies.sort(comparator);
            return dataBase.movies;

    }







    @Override
    public String toString() {
        return "MoviesSer{" +
                "dataBase=" + dataBase +
                '}';
    }
}
