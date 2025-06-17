package lab.lab_01;

import java.io.FileNotFoundException;


/**
 * Fictional driver to represent a serial temperatur sensor
 * @author Matthias Füller
 *
 */
public class SerialPressureSensor {

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
    
   
    public static double getSenosrValue(){
        return SerialPressureSensor.getSenosrValue();

        
    }
}
