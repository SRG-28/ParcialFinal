/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author sofia
 */
public class Weather {
    //Atributos
     double temperature;
     double humidity;
     double barometricPressure;
     
     //métodos
     //costructor
    public Weather(double temperature, double humidity, double barometricPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
    }
    //gets 

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getBarometricPressure() {
        return barometricPressure;
    }
    
}
