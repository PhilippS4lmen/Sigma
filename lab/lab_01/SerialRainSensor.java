package lab.lab_01;

import java.io.FileNotFoundException;


/**
 * Fictional driver to represent a serial temperatur sensor
 * @author Matthias Füller
 *
 */
public class SerialRainSensor {

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
    public static double getSenosrValue(){
        return SerialRainSensor.getSenosrValue();   

        
    }
}
