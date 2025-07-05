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
     * @param SerialWindspeedDriver 
     */
    public Weatherstation(Sensor SerialRainSensor, Sensor SerialPressureSensor, Driver SerialTemperatureDriver, Driver SerialWindsspeeDriver, Driver SerialWindspeedDriver)throws FileNotFoundException{

        this.SerialRainSensor = SerialRainSensor;
        this.SerialPressureSensor = SerialPressureSensor;
        this.SerialTemperatureDriver = SerialTemperatureDriver;
        this.SerialWindspeedDriver = SerialWindspeedDriver;

    }

    public Weatherstation(SerialPressureSensor SPS, SerialRainSensor SRS,
            SerialTemperatureDriver STD, SerialWindspeedDriver SWD) {
        //TODO Auto-generated constructor stub
    }

    public void weatherResults()  {

        System.out.println(SerialRainSensor.getSensorValue());

        System.out.println(SerialPressureSensor.getSensorValue());

        System.out.println(SerialTemperatureDriver.getDriverValue());
    
        System.out.println(SerialWindspeedDriver.getDriverValue());
        
        }
}
