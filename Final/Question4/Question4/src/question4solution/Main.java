package question4solution;

import java.util.*;


public class Main {
    Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
    private int releaseYear(){
     return 0;
    }

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

        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        movies.sort(new DateComparator());
        movies.forEach(movie -> System.out.println("Sorting according to year"+ movie.releaseDate));

        movies.sort(new TitleComparator());
        movies.forEach(movie -> System.out.println("Sorting according to movie title"+ movie.movieTitle));




    }
}
