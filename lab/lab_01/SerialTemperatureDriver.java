package lab.lab_01;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Fictional driver to represent a serial temperatur sensor
 * @author Matthias Füller
 *
 */
public class SerialTemperatureDriver {

    /** 
     * Init SerialDriver with given serial device
     * @param devicename
     * @throws FileNotFoundException
     */
    public SerialTemperatureDriver(String devicename) throws FileNotFoundException {
        if (devicename.equals("/dev/tty0") == false) {
            throw new FileNotFoundException("Could not find serial device");
        }
    }
    
    /**
     * Return the current temperature in Kelvin
     * @return current temperature in Kelvin
     */
    public double read() {
        Random rnd = new Random();

        return 273.15 - 20 + 50 * rnd.nextDouble();
    }
}
