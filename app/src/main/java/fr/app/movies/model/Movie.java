package fr.app.movies.model;

import android.graphics.Bitmap;

import com.orm.SugarRecord;

/**
 * Created by ousse on 01/12/2017.
 */

public class Movie extends SugarRecord {

    private long movieId;
    private String title;
    private Bitmap image;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, Bitmap image) {
        this.title = title;
        this.image = image;
    }

    public Movie(long movieId, String title, Bitmap image) {
        this.movieId = movieId;
        this.title = title;
        this.image = image;
    }


    public long getMOvieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
