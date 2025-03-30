package Main.creational;

import Main.creational.factoryModels.*;

public class AbsFactory {  // Абстрактна фабрика
    public GenreFactory getGenreFactory(String type) {
        if ("modern".equalsIgnoreCase(type)) {
            return new ModernGenFactory();
        } else if ("electronic".equalsIgnoreCase(type)) {
            return new ElectronicGenFactory();
        } else {
            throw new IllegalArgumentException("Unknown genre factory");
        }
    }
}