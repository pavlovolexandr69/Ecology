package com.di;

public class SensorImpl implements Sensor {
    private static final double POLLUTION_LEVEL = 35.0;  // фіксований рівень забруднення

    @Override
    public void analyzeData() {
        System.out.println("Analyzing data from sensor at Lake 1. Pollution level: " + POLLUTION_LEVEL);
    }

    @Override
    public double getPollutionLevel() {
        return POLLUTION_LEVEL;
    }
}
