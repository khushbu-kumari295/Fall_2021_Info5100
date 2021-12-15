package question4solution;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    String title;
    Date releaseDate;
    List<String> actors;
    String director;


    public Movie(String title, int year, int month, int day, List<String> actors, String director) {
        this.title = title;
        Calendar c = new GregorianCalendar(year, month, day);
        this.releaseDate = c.getTime();
        this.actors = actors;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

