package Main.creational.models;

import Main.creational.Song;
import Main.creational.SongPrototype;

public class ElectronicSong extends Song implements SongPrototype {
    public ElectronicSong(String title, String artist, String format, String genre) {
        super(title, artist, format, genre);
    }

    @Override
    public Song cloneSong() {
        return new ElectronicSong(title, artist, format, genre);
    }
}