package Day12.example3;

public class App {
    public static void main(String[] args) {

        Music music = new Music();

        music.addSongBegin("shape of you");
        music.addSongEnd("thats so true");
        music.addSongEnd("set to the fire");
        music.addSongEnd("rolling in the deep");

        music.displayPlaylist();

        music.displayCurrentSong();
        music.displayPreviousSong();
        music.displayUpcomingSong();

        music.playNextSong();

        music.displayPlaylist();

        music.displayPreviousSong();

        music.searchSong("shape of you");

        music.removeFirstSong();
        music.removeLastSong();

        music.displayPlaylist();

        music.clearPlaylist();
    }
}
