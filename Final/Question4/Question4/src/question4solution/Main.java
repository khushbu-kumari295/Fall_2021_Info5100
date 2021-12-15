package question4solution;

import java.util.*;

import java.util.function.Predicate;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Movie m1 = new Movie("m1", 1985, 7, 12, Arrays.asList("A11", "A12", "A13"), "Director1");
        Movie m2 = new Movie("m2", 1998, 8, 13, Arrays.asList("A21", "A22", "A23"), "Director2");
        Movie m3 = new Movie("m3", 2021, 9, 14, Arrays.asList("A31", "A32", "A33"), "Director3");
        Movie m4 = new Movie("m4", 2015, 10, 2, Arrays.asList("A41", "A42", "A43"), "Director4");
        Movie m5 = new Movie("m5", 2005, 11, 15, Arrays.asList("A51", "A52", "A53"), "Director5");
        Movie m6 = new Movie("m6", 2001, 1, 16, Arrays.asList("A61", "A62", "A63"), "Director6");

        Genre g1 = new Genre("SciFi");
        g1.addMovie(m1);
        g1.addMovie(m2);
        Genre g2 = new Genre("Comedy");
        g2.addMovie(m3);
        g2.addMovie(m4);
        Genre g3 = new Genre("Horror");
        g3.addMovie(m5);
        g3.addMovie(m6);

        Netflix netflix = new Netflix();
        netflix.addGenre(g1);
        netflix.addGenre(g2);
        netflix.addGenre(g3);

        Calendar c = new GregorianCalendar(2000, 1, 1);
        List<Movie> movies = netflix.Genres.stream().flatMap(g -> g.getMovies().stream()).collect(Collectors.toList());
        movies.forEach(m -> {

            m.setTitle(m.getReleaseDate().compareTo(c.getTime()) < 0 ? (m.getTitle() + " (Classic)") : m.getTitle());

        });
        System.out.println("\nPrinting movies after title update");
        movies.forEach(m -> {
            System.out.println("Title:" + m.getTitle() + " Release Date: " + m.getReleaseDate());

        });

        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getReleaseDate().compareTo(o1.getReleaseDate());
            }
        });

        List<Movie> latest3Movies = movies.stream().limit(3).collect(Collectors.toList());
        System.out.println("\nPrinting latest 3 movies");
        latest3Movies.forEach(m -> {
            System.out.println("Title:" + m.getTitle() + " Release Date: " + m.getReleaseDate());

        });

        Calendar c1 = new GregorianCalendar(2000, 1, 1);
        Predicate<Date> dateBefore2000 = d -> d.before(c1.getTime());
        Calendar c2 = new GregorianCalendar(1990, 1, 1);
        Predicate<Date> dateAfter1990 = d -> d.after(c2.getTime());
        List<Movie> moviesBetween90And2000 = movies.stream().filter(m -> dateAfter1990.and(dateBefore2000)
                .test(m.releaseDate)).collect(Collectors.toList());

        System.out.println("\nMovies between 1990 and 2000");
        moviesBetween90And2000.forEach(m -> {
            System.out.println("Title:" + m.getTitle() + " Release Date: " + m.getReleaseDate());

        });

        System.out.println("\nAdding release year");
        movies.forEach(m -> {
            System.out.println(addReleaseYearToTitle(m));
        });

        movies.sort(new TitleComparator());
        System.out.println("\nAfter sorting based on Title");
        movies.forEach(m -> {
            System.out.println(m.title + " " + m.releaseDate);
        });
    }

    private static String addReleaseYearToTitle(Movie m) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(m.releaseDate);
        return m.title + " - " + calendar.get(Calendar.YEAR);
    }
}



