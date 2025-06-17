package lab.lab_01;

import java.io.FileNotFoundException;
import java.util.Random;


/**
 * Fictional driver to represent a serial temperatur sensor
 * @author Matthias Füller
 *
 */
public class SerialRainSensor {

    public char[] getSensorValue;

    /** 
     * Init SerialDriver with given serial device
     * @param devicename
     * @throws FileNotFoundException
     */
    public SerialRainSensor(String devicename) throws FileNotFoundException {
        if (devicename.equals("/dev/tty3") == false) {
            throw new FileNotFoundException("Could not find serial device");
        }
    }
    
    /**
     * Return the current temperature in Kelvin
     * @return current temperature in Kelvin
     */
    public double getSensorValue(){
        Random rnd = new Random();

        return rnd.nextDouble();   
        
    }
}
