package Day12;

public class Movie {
    String MovieName;

    Movie(String movieName){
        this.MovieName = movieName;
    }

    @Override
    public String toString() {
        return this.MovieName;
    }
}
