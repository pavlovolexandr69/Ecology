package com.di;

public class WaterSensor implements Sensor {
    private String location = "Lake 1"; // Місцезнаходження сенсора
    private double pollutionLevel = 30.5; // Рівень забруднення води

    @Override
    public void analyzeData() {
        System.out.println("Analyzing water quality at " + location + ". Pollution level: " + pollutionLevel);
    }

    @Override
    public double getPollutionLevel() {
        return pollutionLevel;
    }
}
