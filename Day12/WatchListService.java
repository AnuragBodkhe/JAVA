package Day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class WatchListService {
    ArrayList<Movie> watchList = new ArrayList<>();

    public void addMovie(Movie movie) {

        if (movie.MovieName == null || movie.MovieName.trim().isEmpty()){

            System.out.println("Movie name cannot to be blank");
            return;
        }

        watchList.add(movie);
        System.out.println(movie.MovieName + " added succesfully");
    }

    public void addMultipleMovies(ArrayList<Movie> movies) {

        for (Movie movie : movies) {
            addMovie(movie);
        }
    }

    // Remove Movie
    public void removeMovie(String movieName) {

        boolean removed = watchList.removeIf(
                movie -> movie.MovieName.equalsIgnoreCase(movieName));

        if (removed)
            System.out.println(movieName + " Removed Successfully");
        else
            System.out.println(movieName + " Not Found");
    }

    // Replace Movie
    public void replaceMovie(int position, String newMovie) {

        if (position < 0 || position >= watchList.size()) {
            System.out.println("Invalid Position");
            return;
        }

        watchList.set(position, new Movie(newMovie));

        System.out.println("Movie Replaced Successfully");
    }

    // Display All Movies
    public void displayMovies() {

        if (watchList.isEmpty()) {
            System.out.println("WatchList is Empty");
            return;
        }

        System.out.println("\nMovies In WatchList");

        for (Movie movie : watchList) {
            System.out.println(movie);
        }
    }

    // Display Reverse Order
    public void displayReverseMovies() {

        if (watchList.isEmpty()) {
            System.out.println("WatchList is Empty");
            return;
        }

        System.out.println("\nMovies In Reverse Order");

        for (int i = watchList.size() - 1; i >= 0; i--) {
            System.out.println(watchList.get(i));
        }
    }

    // Sort Alphabetically
    public void sortMovies() {

        watchList.sort(
                Comparator.comparing(
                        movie -> movie.MovieName.toLowerCase()));

        System.out.println("Movies Sorted Successfully");
    }

    // Movies Starting With Character
    public void displayMoviesStartingWith(char ch) {

        System.out.println("\nMovies Starting With " + ch);

        for (Movie movie : watchList) {

            if (movie.MovieName.toLowerCase()
                    .startsWith(String.valueOf(ch).toLowerCase())) {

                System.out.println(movie.MovieName);
            }
        }
    }

    // Count Movies Containing Keyword
    public void countMoviesContainingKeyword(String keyword) {

        int count = 0;

        for (Movie movie : watchList) {

            if (movie.MovieName.toLowerCase()
                    .contains(keyword.toLowerCase())) {

                count++;
            }
        }

        System.out.println("Count : " + count);
    }

    // Display Duplicate Movies
    public void displayDuplicateMovies() {

        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (Movie movie : watchList) {

            if (!seen.add(movie.MovieName.toLowerCase())) {
                duplicates.add(movie.MovieName);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No Duplicates Found");
            return;
        }

        System.out.println("\nDuplicate Movies");

        for (String movie : duplicates) {
            System.out.println(movie);
        }
    }

    // Remove Duplicates Preserve Order
    public void removeDuplicateMovies() {

        HashSet<String> unique = new HashSet<>();
        ArrayList<Movie> updatedList = new ArrayList<>();

        for (Movie movie : watchList) {

            if (unique.add(movie.MovieName.toLowerCase())) {
                updatedList.add(movie);
            }
        }

        watchList = updatedList;

        System.out.println("Duplicates Removed Successfully");
    }
}

