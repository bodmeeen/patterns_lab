package Main.creational.factoryModels;

import Main.creational.Song;
import Main.creational.models.ElectronicSong;

public class ElectronicGenFactory extends Main.creational.GenreFactory {
    @Override
    public Song getSong(String title, String artist, String format, String genre) {
        return new ElectronicSong(title, artist, format, genre);
    }
}