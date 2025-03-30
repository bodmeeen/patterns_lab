package Main.creational.factoryModels;

import Main.creational.Song;
import Main.creational.models.RockSong;

public class ModernGenFactory extends Main.creational.GenreFactory {
    @Override
    public Song getSong(String title, String artist, String format, String genre) {
        return new RockSong(title, artist, format, genre);
    }
}