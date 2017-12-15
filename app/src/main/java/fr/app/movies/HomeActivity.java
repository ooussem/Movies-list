package fr.app.movies;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import fr.app.movies.adapter.MovieListAdapter;
import fr.app.movies.model.Movie;
import fr.app.movies.util.GeneratorMovies;

public class HomeActivity extends AppCompatActivity {

    public AppCompatActivity getActivity() {
        return this;
    }

    private int i = 1;
    private ListView listView;
    private Button buttonAdd;
    private Button buttonDelAll;
    private Button buttonUpdate;
    private List<Movie> movies;
    MovieListAdapter movieListAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = findViewById(R.id.activity_home_list_view);
        buttonAdd = findViewById(R.id.activity_home_button_add);
        buttonDelAll = findViewById(R.id.activity_home_button_delete_all);
        buttonUpdate = findViewById(R.id.activity_home_button_update_all);
        movies = new ArrayList<>();
        Iterator<Movie> iteratorMovies = SugarRecord.findAll(Movie.class);
        while(iteratorMovies.hasNext()) {
            Movie movie = iteratorMovies.next();
            movies.add(movie);
        }
        movieListAdapter = new MovieListAdapter(this, movies);

    }


    @Override
    protected void onStart() {
        super.onStart();
        listView.setAdapter(movieListAdapter);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: call AsyncTask to download image
                Movie movie = GeneratorMovies.generateMovieRandom();
                movie.save();
                movies.add(movie);
                listView.setAdapter(movieListAdapter);
                i++;
            }
        });

        buttonDelAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SugarRecord.deleteAll(Movie.class);
                movies.removeAll(movies);
                listView.setAdapter(movieListAdapter);
                i = 1;
            }
        });


        // TODO: update object ?
//        buttonUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Movie movie = new Movie(GeneratorMovies.generateMovieRandom());
//                movie.update();
//                movies.add(movie);
//                listView.setAdapter(movieListAdapter);
//                i++;
//            }
//        });




    }


}
