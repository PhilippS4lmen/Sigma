package lab.lab_01;
import java.io.FileNotFoundException;



public class Weatherstation {

// serialtempature und windspeed als attribut von weatherstation erstellen
    
    private Sensor SerialRainSensor;
    private Sensor SerialPressureSensor;
    private Driver SerialTemperatureDriver;
    private Driver SerialWindspeedDriver;

    /**
     * @param SerialRainSensor
     * @param SerialPressureSensor
     * @param SerialTemperatureDriver
     */
    public Weatherstation(Sensor SerialRainSensor, Sensor SerialPressureSensor, Driver SerialTemperatureDriver, Driver SerialWindspeedDriver)throws FileNotFoundException{

        this.SerialRainSensor = SerialRainSensor;
        this.SerialPressureSensor = SerialPressureSensor;
        this.SerialTemperatureDriver = SerialTemperatureDriver;
        this.SerialWindspeedDriver = SerialWindspeedDriver;

    }

    public void weatherResults()  {

        System.out.println(SerialRainSensor.getSensorValue());

        System.out.println(SerialPressureSensor.getSensorValue());

        System.out.println(SerialTemperatureDriver.getDriverValue());
    
        System.out.println(SerialWindspeedDriver.getDriverValue());
        
        }
}
