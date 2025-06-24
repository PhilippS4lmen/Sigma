package lab;

import lab.lab_01.SerialPressureSensor;
import lab.lab_01.SerialRainSensor;
import lab.lab_01.SerialTemperatureDriver;
import lab.lab_01.SerialWindspeedDriver;
import lab.lab_01.Weatherstation;

public class App {
    public static void main(String[] args) throws Exception {

        SerialPressureSensor SerialPressureSensor = new SerialPressureSensor();
        SerialRainSensor SerialRainSensor = new SerialRainSensor();
        SerialTemperatureDriver SerialTemperatureDriver = new SerialTemperatureDriver();
        SerialWindspeedDriver SerialWindspeedDriver = new SerialWindspeedDriver();

        Weatherstation WS = new Weatherstation (SerialPressureSensor, SerialRainSensor, SerialTemperatureDriver, SerialWindspeedDriver);
        WS.weatherResults();



    }
}