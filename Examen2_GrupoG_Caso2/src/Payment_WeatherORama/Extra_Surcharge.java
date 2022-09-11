package Payment_WeatherORama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Donald Córdoba Campos, Sofía Rubie García, Ali Pitti González, Kyara Ávalos Escobar
 */
public class Extra_Surcharge implements IExtras {
    @Override
    public double rules(double amount){
        return amount*0.05;
    }
}
