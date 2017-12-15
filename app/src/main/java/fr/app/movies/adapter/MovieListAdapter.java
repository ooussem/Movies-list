package fr.app.movies.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.app.movies.R;
import fr.app.movies.model.Movie;

/**
 * Created by ousse on 24/11/2017.
 */

public class MovieListAdapter extends ArrayAdapter<Movie> {
    private Activity context;
    private List<Movie> moviesList;

    public MovieListAdapter(@NonNull Activity context, @NonNull List<Movie> movies) {
        super(context, R.layout.row_movies_activity_home, movies);
        this.context = context;
        this.moviesList = movies;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewEvent = inflater.inflate(R.layout.row_movies_activity_home, null,true);

        TextView titleViewMovie = listViewEvent.findViewById(R.id.row_courses_titre);
        ImageView imageMovie = listViewEvent.findViewById(R.id.row_courses_image);

        Movie movie = moviesList.get(position);
        titleViewMovie.setText(movie.getTitle());
        imageMovie.setImageBitmap(movie.getImage());

        return listViewEvent;
    }
}
