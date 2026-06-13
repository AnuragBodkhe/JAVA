package Day12.example3;

import java.util.LinkedList;
import java.util.List;

public class Music {

    List<String> playlist = new LinkedList<>();

    // add a song begin
    public void addSongBegin(String song) {
        playlist.addFirst(song);
    }

    // add a song at end
    public void addSongEnd(String song) {
        playlist.addLast(song);
    }

    // remove the first song
    public void removeFirstSong() {
        playlist.removeFirst();
    }

    // remove the last song
    public void removeLastSong() {
        playlist.removeLast();
    }

    // display current playing song
    void displayCurrentSong() {

        if (playlist.isEmpty()) {
            System.out.println("No Songs Available");
            return;
        }

        System.out.println("Current Song : "
                + playlist.getFirst());
    }

    // Previous Played Song
    void displayPreviousSong() {

        if (playlist.isEmpty()) {
            System.out.println("No Previous Song");
            return;
        }

        System.out.println("Previous Song : "
                + playlist.getLast());
    }

    // Upcoming Song
    void displayUpcomingSong() {

        if (playlist.size() < 2) {
            System.out.println("No Upcoming Song");
            return;
        }

        System.out.println("Upcoming Song : "
                + playlist.get(1));
    }

    // Play Next Song
    void playNextSong() {

        if (playlist.size() <= 1) {
            System.out.println("No Next Song Available");
            return;
        }

        String currentSong = playlist.removeFirst();

        playlist.addLast(currentSong);

        System.out.println("Now Playing : "
                + playlist.getFirst());
    }

    // Search Song
    void searchSong(String songName) {

        if (playlist.contains(songName)) {
            System.out.println(songName + " Found");
        } else {
            System.out.println(songName + " Not Found");
        }
    }

    // Display Playlist
    void displayPlaylist() {

        if (playlist.isEmpty()) {
            System.out.println("Playlist is Empty");
            return;
        }

        System.out.println("=========== PLAYLIST ==========");

        for (String song : playlist) {
            System.out.println(song);
        }
    }

    // Clear Playlist
    void clearPlaylist() {

        playlist.clear();
        playlist.clear();

        System.out.println("Playlist Cleared");
    }
}