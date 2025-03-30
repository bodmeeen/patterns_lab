package Main.creational;

import Main.creational.models.RockSong;

public class SongBuilder {  // Будівельник
    private String title;
    private String artist;
    private String format;
    private String genre;

    public SongBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public SongBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public SongBuilder setFormat(String format) {
        this.format = format;
        return this;
    }

    public SongBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Song build() {
        return new RockSong(title, artist, format, genre);
    }
}
