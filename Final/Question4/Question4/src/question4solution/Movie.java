package question4solution;

import java.util.*;

public class Movie {
    String movieTitle;
    Date releaseDate;
    String Director;
    ArrayList<Object> actors;

    public Movie(String movieTitle, int yyyy, int mm, int dd, String director) {
        this.movieTitle = movieTitle;
        Calendar c = new GregorianCalendar(yyyy,mm,dd);

        this.releaseDate = c.getTime();
        Director = director;
        this.actors = new ArrayList<Object>();
    }

    public Movie(String abcd, int yyyy, int mm, int dd, List<String> asList, String sanjay) {
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return Director;
    }

    public ArrayList<Object> getActors() {
        return actors;
    }
}
