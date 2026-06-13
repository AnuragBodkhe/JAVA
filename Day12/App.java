package Day12;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        WatchListService watchListService = new WatchListService();

        watchListService.addMovie(new Movie("Money heist"));
        watchListService.addMovie(new Movie("Dark"));
        watchListService.addMovie(new Movie("Breaking Bad"));
        watchListService.addMovie(new Movie("Dark"));
        watchListService.addMovie(new Movie("Stranger things"));

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Wednesday"));
        movies.add(new Movie("Lucifer"));
        movies.add(new Movie("Money heist"));

        watchListService.addMultipleMovies(movies);
        watchListService.displayMovies();

        watchListService.removeMovie("Dark");
        watchListService.displayMovies();

        watchListService.replaceMovie(2, "Once upon in hollywood");
        watchListService.displayMovies();

        watchListService.displayReverseMovies();

        watchListService.sortMovies();

        watchListService.displayMoviesStartingWith('S');

        watchListService.countMoviesContainingKeyword("Lucifer");

        watchListService.displayDuplicateMovies();

        watchListService.removeDuplicateMovies();

        watchListService.displayMovies();
    }
}
