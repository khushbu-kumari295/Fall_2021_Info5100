package question4solution;

import java.util.List;

public class Netflix {
    List<Genre> genres;

    public Netflix(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenres() {
        return genres;
    }
}
