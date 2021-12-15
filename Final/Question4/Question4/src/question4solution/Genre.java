package question4solution;

import java.util.List;

public class Genre {
    List<Movie> movies;

    public Genre(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
