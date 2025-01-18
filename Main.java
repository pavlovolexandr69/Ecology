import java.util.List;
import java.util.ArrayList;

// Абстрактний клас Sensor
abstract class Sensor {
    protected String location;
    protected float pollutionLevel;

    // Метод для отримання рівня забруднення
    public float getPollutionLevel() {
        return pollutionLevel;
    }

    // Абстрактний метод для запису даних
    public abstract void recordData();
}

// Клас WaterSensor (нащадок Sensor)
class WaterSensor extends Sensor {
    private float waterQualityIndex;

    // Конструктор
    public WaterSensor(String location, float waterQualityIndex) {
        this.location = location;
        this.waterQualityIndex = waterQualityIndex;
        this.pollutionLevel = waterQualityIndex;
    }

    // Перевизначення методу для вимірювання рівня забруднення
    @Override
    public float getPollutionLevel() {
        return waterQualityIndex;
    }

    // Реалізація методу запису даних
    @Override
    public void recordData() {
        System.out.println("Recording water quality at location: " + location);
    }

    // Перезавантажений метод запису даних
    public void recordData(String sampleID) {
        System.out.println("Recording water quality for sample: " + sampleID);
    }
}

// Клас AirSensor (нащадок Sensor)
class AirSensor extends Sensor {
    private float airQualityIndex;

    // Конструктор
    public AirSensor(String location, float airQualityIndex) {
        this.location = location;
        this.airQualityIndex = airQualityIndex;
        this.pollutionLevel = airQualityIndex;
    }

    // Перевизначення методу для вимірювання рівня забруднення
    @Override
    public float getPollutionLevel() {
        return airQualityIndex;
    }

    // Реалізація методу запису даних
    @Override
    public void recordData() {
        System.out.println("Recording air quality at location: " + location);
    }

    // Перезавантажений метод запису даних
    public void recordData(String area) {
        System.out.println("Recording air quality in area: " + area);
    }
}

// Інтерфейс Reportable
interface Reportable {
    String generateReport();
    void sendReport();
}

// Клас Ecologist (реалізує Reportable)
class Ecologist implements Reportable {
    private String name;

    // Конструктор
    public Ecologist(String name) {
        this.name = name;
    }

    // Реалізація методів з інтерфейсу Reportable
    @Override
    public String generateReport() {
        return "Ecologist report generated.";
    }

    @Override
    public void sendReport() {
        System.out.println("Sending report...");
    }

    // Метод для аналізу даних
    public void analyzeData(Sensor sensor) {
        System.out.println("Analyzing data from sensor at " + sensor.location + ". Pollution level: " + sensor.getPollutionLevel());
    }
}

// Клас LocalAuthority
class LocalAuthority {
    private List<String> actionsTaken;

    // Конструктор
    public LocalAuthority() {
        actionsTaken = new ArrayList<>();
    }

    // Метод для вживання заходів на основі звіту
    public void takeAction(String report) {
        actionsTaken.add(report);
        System.out.println("Taking action based on report: " + report);
    }
}

// Демонстрація роботи системи
public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкти датчиків
        WaterSensor waterSensor = new WaterSensor("Lake 1", 35.0f);
        AirSensor airSensor = new AirSensor("City Center", 45.0f);

        // Створюємо еколога і місцеву владу
        Ecologist ecologist = new Ecologist("John Doe");
        LocalAuthority localAuthority = new LocalAuthority();

        // Еколог аналізує дані з датчиків
        ecologist.analyzeData(waterSensor);
        ecologist.analyzeData(airSensor);

        // Еколог генерує звіт і надсилає його
        String report = ecologist.generateReport();
        ecologist.sendReport();

        // Місцева влада приймає заходи
        localAuthority.takeAction(report);
    }
}
