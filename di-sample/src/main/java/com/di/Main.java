package com.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        // Створюємо інжектор та впроваджуємо залежності через EcologistModule
        Injector injector = Guice.createInjector(new EcologistModule());
        
        // Отримуємо еколога через інжектор
        Ecologist ecologist = injector.getInstance(Ecologist.class);
        
        // Викликаємо метод аналізу
        ecologist.analyze();
    }
}
