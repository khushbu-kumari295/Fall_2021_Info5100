package question4solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("ABCD", 2009,02,12,
                Arrays.asList("Sharaukh","Vivek","Shahid"),"Sanjay"));

        movies.add(new Movie("How I met your Mother", 1993, 01,14,
                Arrays.asList("Robin","Lilly","Barney"),"Brian"));

        movies.add(new Movie("Titanic", 1995, 8,15,
                Arrays.asList("Robin","Lilly","Barney"),"Harison"));
        movies.add(new Movie("SuperGirl", 2003, 05,15,
                Arrays.asList("Kara","George","Ria"),"Peter Manson"));
        movies.stream().flatMap(movie -> movie.getMovieTitle()+ "Classic").collect(Collectors.toList());
        movies.stream().filter(movie -> movie.releaseDate,)

    }
}
