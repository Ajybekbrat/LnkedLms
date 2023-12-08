import models.Actors;
import models.Movie;
import models.Producer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DataBase {

    LinkedList<Producer> producers = new LinkedList<>(Arrays.asList(
            new Producer(1, "Yryskeldi", "Apyshov")));
    LinkedList<Producer> producers1 = new LinkedList<>(Arrays.asList(
            new Producer(2, "Duulat","Anarkulov")));
    LinkedList<Producer> producers3 = new LinkedList<>(Arrays.asList(
            new Producer(3, "Chyngyz","Abdyldaev")


    ));
    LinkedList<Actors> actors = new LinkedList<>(Arrays.asList(
            new Actors(1,"Bakyt", "Urmat"),
            new Actors(2,"Nurmuhammed", "Nurgazy"),
            new Actors(3,"vin", "Toretto")));
            LinkedList<Actors> actors2 = new LinkedList<>(Arrays.asList(
            new Actors(4,"Conor", "Brain"),
            new Actors(5,"Jenny", "Letti"),
            new Actors(6,"Erbol", "Ilim")));
    LinkedList<Actors> actors3 = new LinkedList<>(Arrays.asList(

            new Actors(7,"Aman", "Zarip"),
            new Actors(8,"Alisher", "Daulet"),
            new Actors(9,"Kutman", "Ajybek"),
            new Actors(10,"Zarina", "Karina"),
            new Actors(11,"Balam", "Shumkar"),
            new Actors(12,"Atasy", "Ascat")
    ));
    LinkedList<Movie> movies = new LinkedList<>(Arrays.asList(
            new Movie("word of man", "2020", "detective", producers, actors),
            new Movie("fast furious", "2006", "car", producers1, actors2),
            new Movie("bajarici", "2018", "comedy",producers3,actors3)
    ));




//            new Movie("malysh", "2023", "comedy",
//                    new Producer("Jakypov", "Aziret"),
//                    new Actors("Balam", "Shumkar"),
//                    new Actors("Atasy", "Ascat")),
//
//                    new Movie("resept of happy", "2022", "dramma",
//                            new Producer("Apyshov", "Yryskeldi"),
//                            new Actors("Kutman", "Ajybek"),
//                            new Actors("Zarina", "Karina")),
//
//                            new Movie("word of man", "2020", "detectiv",
//                                    new Producer("Kamchiev", "Nurkamil"),
//                                    new Actors("Erbol", "Ilim"),
//                                    new Actors("Aman", "Zarip"),
//                                    new Actors("Alisher", "Daulet")),
//
//                                    new Movie("fast forius", "2006", "car",
//                                            new Producer("Anarkulov", "Duulat"),
//                                            new Actors("vin", "Toretto"),
//                                            new Actors("Conor", "Brain"),
//                                            new Actors("Jenny", "Letti")),
//
//                                            new Movie("bajarici", "2018", "comedy",
//                                                    new Producer("Abdyldaev", "Chyngyz"),
//                                                    new Actors("Bakyt", "Urmat"),
//                                                    new Actors("Nurmuhammed", "Nurgazy")
//                                            ));












    @Override
    public String toString() {
        return "DataBase{" +
                "movies=" + movies +


                '}';
    }
}

