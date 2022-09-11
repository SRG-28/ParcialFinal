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
public class Forecast implements Observer{
    
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
    
    public double forecast(List<Double> list){
        double error = 0;
        int op = (int) (Math.random()*3 + 1) ;
        //opcion 1
            if (op == 1){
            //usa el promedio
            double foreCast = 0;
            for(int i = 0; i < list.size(); i++){
                foreCast += list.get(i);
            }
            return foreCast/list.size();
            }
            //opcion 2
            else if (op == 2){
            //usa el maximo
            double foreCast = 0;
            for(int i = 0; i < list.size(); i++){
                if(foreCast==0){
                foreCast = list.get(i);
                }   
                if(foreCast<list.get(i)){
                foreCast = list.get(i); 
                }
            }
            return foreCast;
            }
            //opcion 3
             else if (op == 3){
            //usa el minimo
            double foreCast = 0;
            for(int i = 0; i < list.size(); i++){
                if(foreCast==0){
                foreCast = list.get(i);
                }   
                if(foreCast>list.get(i)){
                foreCast = list.get(i); 
                }
                return foreCast;
            }
        }
        return error;
           
    }
    
        @Override
    public void print(){
        double temp = forecast(temperatureList);
        System.out.println("\n------------ Forecast -----------");
        System.out.println("Temperature: " + temp);       
        System.out.println("Humidity: " + forecast(humidityList));      
        System.out.println("Barometric Pressure: " + forecast(barometricList));
        System.out.println("---Detail----");
        if(temp < 20){
        System.out.println("Forecast detail for today: cold or freezing "); 
        }
        else if( (20 < temp) && (temp< 30)){
        System.out.println("Forecast detail for today: cool or chilly "); 
        }
        else if (30 < temp){
          System.out.println("Forecast detail for today: warm or hot");
        }
    }
    
}
