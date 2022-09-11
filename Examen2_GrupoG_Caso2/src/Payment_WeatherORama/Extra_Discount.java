package Payment_WeatherORama;

/*
 * Implementación de la Interfaz IExtra
 */

/**
 *
 * @author Donald Córdoba Campos, Sofía Rubie García, Ali Pitti González, Kyara Ávalos Escobar
 */
public class Extra_Discount implements IExtras {
    @Override
    public double rules(double amount){
        return amount*0.25;
    }
    
    
}
