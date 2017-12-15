package fr.app.movies.util;

import java.util.Random;

import fr.app.movies.model.Movie;

/**
 * Created by ousse on 15/12/2017.
 */

public class GeneratorMovies {

    public static Movie generateMovieRandom() {
        String[] titles = {"Toto", "Tutu", "Tata", "Champion"};
        Movie movie = new Movie(titles[new Random().nextInt(4)]);
        return movie;
    }
}
