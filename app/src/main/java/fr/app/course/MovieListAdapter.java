package fr.app.course;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import fr.app.course.model.Movie;

/**
 * Created by ousse on 24/11/2017.
 */

public class MovieListAdapter extends ArrayAdapter<String> {
    private Activity context;
    private List<String> moviesList;


    public MovieListAdapter(@NonNull Activity context, List<String> moviesList) {
        super(context, R.layout.row_movies_activity_home,moviesList);
        this.context = context;
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewEvent = inflater.inflate(R.layout.row_movies_activity_home,null,true);
        TextView titleMovie = (TextView) listViewEvent.findViewById(R.id.row_courses_titre);
        Movie movie = new Movie(moviesList.get(position));
        titleMovie.setText(movie.getTitle());

        return listViewEvent;
    }
}
