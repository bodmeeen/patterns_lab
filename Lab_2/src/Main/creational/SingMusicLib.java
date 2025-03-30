package Main.creational;

import java.util.ArrayList;
import java.util.List;

public class SingMusicLib {  // Одинак (Singleton)
    private static Main.creational.SingMusicLib instance = null;
    private List<Song> songs = new ArrayList<>();

    private SingMusicLib() {}

    public static Main.creational.SingMusicLib getInstance() {
        if (instance == null) {
            instance = new Main.creational.SingMusicLib();
        }
        return instance;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void showSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}