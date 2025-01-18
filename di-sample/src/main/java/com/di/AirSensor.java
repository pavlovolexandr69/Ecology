package com.di;

public class AirSensor implements Sensor {
    private String location = "Lake 1"; // Місцезнаходження сенсора
    private double pollutionLevel = 35.0; // Рівень забруднення повітря

    @Override
    public void analyzeData() {
        System.out.println("Analyzing air quality at " + location + ". Pollution level: " + pollutionLevel);
    }

    @Override
    public double getPollutionLevel() {
        return pollutionLevel;
    }
}
