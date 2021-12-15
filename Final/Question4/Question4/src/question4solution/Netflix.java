package question4solution;

import java.util.ArrayList;
import java.util.List;

public class Netflix {

    List<Genre> genres;

    public Netflix() {
        genres = new ArrayList<>();
    }

    public void addGenre(Genre g) {
        genres.add(g);
    }
}