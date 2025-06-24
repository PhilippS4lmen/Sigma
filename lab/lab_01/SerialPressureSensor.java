package lab.lab_01;

import java.io.FileNotFoundException;
import java.util.Random;


/**
 * Fictional driver to represent a serial temperatur sensor
 * @author Matthias Füller
 *
 */
public class SerialPressureSensor {

    double SV = 0;   
    /** 
     * Init SerialDriver with given serial device
     * @param devicename
     * @throws FileNotFoundException
     */
    public SerialPressureSensor(String devicename) throws FileNotFoundException {
        if (devicename.equals("/dev/tty2") == false) {
            throw new FileNotFoundException("Could not find serial device");
        }
    }
    
   
    public double getSensorValue(){
        Random rnd = new Random();        

        return rnd.nextDouble();   
        SV + rnd.nextDouble();

    }
}
