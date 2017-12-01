package fr.app.course.model;

/**
 * Created by ousse on 01/12/2017.
 */

public class Movie {
    private long id;
    private String title;

    public Movie() {
    }

    public Movie(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Movie(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
