package lab.lab_01;
import java.io.FileNotFoundException;



public class Weatherstation {

// serialtempature und windspeed als attribut von weatherstation erstellen
    
   
    SerialTemperatureDriver STD = new SerialTemperatureDriver("/dev/tty0");
    SerialWindspeedDriver SWD = new SerialWindspeedDriver("/dev/tty1");
    SerialPressureSensor SPS = new SerialPressureSensor("/dev/tty2");
    SerialRainSensor SRS = new SerialRainSensor("/dev/tty3");
    public Weatherstation()throws FileNotFoundException{

    }

    public void weatherResults()  {

        
        
        System.out.println(STD.read());
    
        System.out.println(SWD.currentWindspeed());
        
        System.out.println(SPS.getSensorValue());
        
        System.out.println(SRS.getSensorValue());


        }
}
