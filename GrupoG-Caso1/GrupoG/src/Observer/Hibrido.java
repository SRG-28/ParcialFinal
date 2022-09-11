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
public class Hibrido {   
    //métodos
    public Weather hibrido(Weather w1, Weather w2){
        //combina 2 temperaturas
        double temp;
        temp =  (w1.getTemperature() + w2.getTemperature()) /2;
        //combina 2 humedades
        double hum;
        hum =  (w1.getHumidity() + w2.getHumidity()) /2;
        //combina 2 presiones barometricas
        double bar;
        bar =  (w1.getBarometricPressure() + w2.getBarometricPressure()) /2;
        Weather hibrido = new Weather(temp,hum,bar);
        return hibrido;
    }
        
}
