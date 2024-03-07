package structural.adapter.example1;

/*
 Step 1: Adaptee (TemperatureSensor)
 The existing class or system with an incompatible interface
 that needs to be integrated into the new system.
 */
class TemperatureSensor {
    protected double getTemperatureInFahrenheit() {
        // Assume some logic to get temperature in Fahrenheit
        return 75.0;
    }
}

/*
  Step 2: Target Interface (TemperatureProvider)
  The interface expected by the client.
  It represents the set of operations that the client code can use.
 */
interface TemperatureProvider {
    double getTemperature();
}

/*
    Step 3: Adapter (TemperatureAdapter)
    A class that implements the target interface
    and internally uses an instance of the adaptee to make it
    compatible with the target interface.
 */
class TemperatureAdapter implements TemperatureProvider {
    private final TemperatureSensor temperatureSensor;

    TemperatureAdapter(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @Override
    public double getTemperature() {
        // Convert Fahrenheit to Celsius
        double temperatureInFahrenheit = temperatureSensor.getTemperatureInFahrenheit();
        return (temperatureInFahrenheit - 32) * 5 / 9;
    }
}

public class Temperature {
    public static void main(String[] args) {
        // Existing TemperatureSensor
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Adapter to convert TemperatureSensor to TemperatureProvider
        TemperatureProvider temperatureProvider = new TemperatureAdapter(temperatureSensor);

        // Client code expects temperature in Celsius
        double temperatureInCelsius = temperatureProvider.getTemperature();
        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
    }
}

