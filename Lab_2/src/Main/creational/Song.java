package Main.creational;

public abstract class Song {
    protected String title;
    protected String artist;
    protected String format;
    protected String genre;

    public Song(String title, String artist, String format, String genre) {
        this.title = title;
        this.artist = artist;
        this.format = format;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " + title + " by " + artist + ", format: " + format + ", genre: " + genre;
    }
}