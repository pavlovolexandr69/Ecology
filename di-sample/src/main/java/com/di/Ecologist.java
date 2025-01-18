package com.di;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Ecologist {
    private final String name;
    private final Sensor sensor;

    @Inject
    public Ecologist(@Named("Ecologist Name") String name, Sensor sensor) {
        this.name = name;
        this.sensor = sensor;
    }

    public void analyze() {
        sensor.analyzeData();  // аналіз даних
        
        // Створення звіту
        String report = "Ecologist report generated.";
        System.out.println(report);
        
        // Надсилання звіту
        sendReport(report);
        
        // Вжиття дій
        takeAction(report);
    }

    private void sendReport(String report) {
        System.out.println("Sending report...");
    }

    private void takeAction(String report) {
        // Оцінка рівня забруднення та вжиття дій
        double pollutionLevel = sensor.getPollutionLevel();
        System.out.println("Taking action based on report: " + report);
        
        if (pollutionLevel > 30.0) {
            System.out.println("Action taken: Cleaning process initiated.");
        }
    }
}
