/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofia
 */
public class WeatherStats implements Observer{
    //atributos
    private final List<Double> temperatureList = new ArrayList();
    private final List<Double> humidityList = new ArrayList();
    private final List<Double> barometricList= new ArrayList();
    
    //métodos
     @Override
    public void update(Weather w){
        temperatureList.add(w.getTemperature());
        humidityList.add(w.getHumidity());
        barometricList.add(w.getBarometricPressure());
    }
    
    public void min(List<Double> list){
        double min = 0;
        for(int i = 0; i < list.size(); i++){
            if(min==0)
                min = list.get(i);
                
            if(min>list.get(i))
                min = list.get(i);            
        }
        
        System.out.println("Minimun: " + min);
    }
    public void average(List<Double> list){
        double promedio = 0;
        
        for(int i = 0; i < list.size(); i++){
            promedio += list.get(i);
        }
        
        System.out.println("Average: " + promedio/list.size());
    }
    public void max(List<Double> list){
        double max = 0;
        for(int i = 0; i < list.size(); i++){
            if(max==0)
                max = list.get(i);
                
            if(max<list.get(i))
                max = list.get(i);            
        }
        
        System.out.println("Maximun: " + max);
    }
    
       @Override
    public void print(){
        System.out.println("\n--------Weather Stats--------");
        System.out.println("Temperature: ");
        average(temperatureList);
        max(temperatureList);
        min(temperatureList);
        
        System.out.println("Humidity: ");
        average(humidityList);
        max(humidityList);
        min(humidityList);
        
        System.out.println("Barometric Pressure: ");
        average(barometricList);
        max(barometricList);
        min(barometricList);
    }
     
}
