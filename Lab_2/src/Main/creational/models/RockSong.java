package Main.creational.models;

import Main.creational.Song;
import Main.creational.SongPrototype;

public class RockSong extends Song implements SongPrototype {
    public RockSong(String title, String artist, String format, String genre) {
        super(title, artist, format, genre);
    }

    @Override
    public Song cloneSong() {
        return new RockSong(title, artist, format, genre);
    }
}