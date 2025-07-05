package lab;

import lab.lab_01.SerialPressureSensor;
import lab.lab_01.SerialRainSensor;
import lab.lab_01.SerialTemperatureDriver;
import lab.lab_01.SerialWindspeedDriver;
import lab.lab_01.Weatherstation;

public class App {
    public static void main(String[] args) throws Exception {

        SerialPressureSensor SPS = new SerialPressureSensor("dev/tty2");
        SerialRainSensor SRS = new SerialRainSensor("dev/tty1");
        SerialTemperatureDriver STD = new SerialTemperatureDriver("dev/tty3");
        SerialWindspeedDriver SWD = new SerialWindspeedDriver("dev/tty4");

        Weatherstation WS = new Weatherstation (SPS, SRS, STD  , SWD);
        WS.weatherResults();



    }
}