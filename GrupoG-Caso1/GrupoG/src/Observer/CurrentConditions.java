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
public class CurrentConditions implements Observer{
    //atributos
    Weather weather;
    //mètodos
    //constructor

    @Override
    public void update(Weather w){
        this.weather = w;
       
    }
    
    @Override
    public void print(){
        System.out.println("------Current Conditions------");
        System.out.println("Temperature: " + weather.getTemperature());
        System.out.println("Humidity: " + weather.getHumidity());
        System.out.println("Barometric Pressure: " + weather.getBarometricPressure());
    }
    
}
