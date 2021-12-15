package question4solution;

import java.util.ArrayList;
import java.util.List;

public class Netflix {

    List<Genre> Genres;

    public Netflix() {
        Genres = new ArrayList<>();
    }

    public void addGenre(Genre g) {
        Genres.add(g);
    }
}