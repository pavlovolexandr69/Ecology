package com.di;

import java.util.List;

public class LocalAuthority {
    private List<String> actionsTaken;

    // Додаємо конструктор, який приймає список
    public LocalAuthority(List<String> actionsTaken) {
        this.actionsTaken = actionsTaken;
    }

    // Тепер метод може додавати дії до списку
    public void takeAction(String report) {
        actionsTaken.add(report);
        System.out.println("Actions taken: " + actionsTaken);
    }
}
