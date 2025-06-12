package lab;
import lab.lab_01.SerialTemperatureDriver;
import lab.lab_01.SerialWindspeedDriver;
import lab.lab_01.Weatherstation;

public class App {
    public static void main(String[] args) throws Exception {
        
        Weatherstation WS = new Weatherstation();
        WS.weatherResults();

    }
}
