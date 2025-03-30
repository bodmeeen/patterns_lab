package Main.creational;

public abstract class GenreFactory {  // Фабрика
    public abstract Song getSong(String title, String artist, String format, String genre);
}