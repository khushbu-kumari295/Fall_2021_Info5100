package question4solution;

import java.util.Comparator;

public class DateComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.releaseDate.compareTo(o2.releaseDate);
    }
}
