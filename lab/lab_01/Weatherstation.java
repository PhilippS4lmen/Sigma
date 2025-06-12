package lab.lab_01;
import java.io.FileNotFoundException;



public class Weatherstation {

// serialtempature und windspeed als attribut von weatherstation erstellen

    
       public void weatherResults() throws FileNotFoundException {

        
        SerialTemperatureDriver STD = new SerialTemperatureDriver("/dev/tty0");
        System.out.println(STD.read());
        SerialWindspeedDriver SWD = new SerialWindspeedDriver("/dev/tty1");
        System.out.println(SWD.currentWindspeed());

        }
}
