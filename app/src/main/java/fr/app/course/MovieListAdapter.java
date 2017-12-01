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

/**
 * Created by ousse on 24/11/2017.
 */

public class MovieListAdapter extends ArrayAdapter<String> {
    private Activity context;
    private List<String> moviesList;


    public MovieListAdapter(@NonNull Context context, int resource, Activity context1, List<String> moviesList) {
        super(context, resource);
        this.context = context1;
        this.moviesList = moviesList;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewEvent = inflater.inflate(R.layout.row_movies_activity_home,null,true);
        TextView textViewTitle = (TextView) listViewEvent.findViewById(R.id.event_information_title);
        String titre = eventsList.get(position);

        textViewTitle.setText(event.title);
        textViewPlace.setText(event.place);
        textViewDescription.setText(event.description);
        textViewStart.setText(event.startDate);
        textViewEnd.setText(event.endDate);
        textViewDescription.setText(event.description);
        textViewTransport.setText(event.transportMode);

        return listViewEvent;
    }
}
