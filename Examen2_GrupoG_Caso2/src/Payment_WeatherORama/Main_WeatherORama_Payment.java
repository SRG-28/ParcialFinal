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
public class Main_WeatherORama_Payment {
    public static void main(String[] args){
        PaymentManager payManager= new PaymentManager();
        
        Company company1 = new Company("INSTITUTO METEORLOGICO NACIONAL DE COSTA RICA");
        Company company2 = new Company("MINISTERIO DE AMBIENTE Y ENERGIA");
        Company company3 = new Company("DIRECCION METEOROLOGICA DE CHILE");
        Company company4 = new Company("MINISTERIO DE MEDIO AMBIENTE DE CHILE ");
        Company company5 = new Company("METEOSIM");
        
        company1.addDevices(4);
        company2.addDevices(5);
        company3.addDevices(32);
        company4.addDevices(55);
        company5.addDevices(198);
        
        payManager.attach(company1);
        payManager.attach(company2);
        payManager.attach(company3);
        payManager.attach(company4);
        payManager.attach(company5);
        
        System.out.println("\n***************January Data***************\n");
        payManager.notifyUpdate();
        
        company3.subDevices(4);
        company4.subDevices(12);
        company5.subDevices(18);
        System.out.println("\n***************February Data***************\n");
        payManager.notifyUpdate();
        
        company1.addDevices(3);
        company2.addDevices(7);
        
        System.out.println("\n***************March Data***************\n");
        payManager.notifyUpdate();
        
     
    }
}
