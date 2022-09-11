package Payment_WeatherORama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Donald Córdoba Campos, Sofía Rubie García, Ali Pitti González, Kyara Ávalos Escobar
 */
public class PaymentManager implements IPaymentPublisher {
   
    Company company;
    int actualDevices;
    int pastDevices;
    double amountCount;
    double extras;
    public ArrayList<Company> observers= new ArrayList();
    
    @Override
    public void attach(Company company) {
        this.observers.add(company);
    }

    @Override
    public void detach(Company company) {
        this.observers.remove(company);
    }

    @Override
    public void notifyUpdate() {
        for(int i =0; i < observers.size(); i++){
            company = observers.get(i);
            
            System.out.println("----------------------------------------------------");
            System.out.println("Company: " + company.getName());
            
            actualDevices = company.getActualDevices();
            pastDevices = company.getPastDevices();
            
            System.out.println("Devices: " + company.getActualDevices());
            System.out.print("Pay for Devices ");
            
            if(actualDevices >= 100){
                
                System.out.println(" $" + 0.05);
                IPayment payment = new Payment_100Devices();
                amountCount = payment.payment(actualDevices);
            }
            else{
                if(actualDevices>=50 && actualDevices<=90){
                    
                    System.out.println("$" + 0.07);
                    IPayment payment = new Payment_50to99Devices();
                    amountCount = payment.payment(actualDevices);
                }
                else{
                    if(actualDevices>=6 && actualDevices<=49){
                        
                        System.out.println("$" + 0.10);
                        IPayment payment = new Payment_6to49Devices();
                        amountCount = payment.payment(actualDevices);
                    }
                    else{
                        
                        System.out.println("$" + 0);
                        IPayment payment = new Payment_Lessor5();
                        amountCount = payment.payment(actualDevices);
                    }
                }
            }
            
            if(pastDevices!=0){
                if(actualDevices < pastDevices){
                    IExtras extra = new Extra_Surcharge();
                    extras = extra.rules(amountCount);
                    System.out.println("Surcharge of $: " + extras);
                    amountCount = amountCount + extras;   
                }
                else{
                     if(actualDevices > pastDevices){
                        IExtras extra = new Extra_Discount();
                        extras = extra.rules(amountCount);
                        System.out.println("Discount of $: " + extras);
                        amountCount = amountCount - extras;
                    }
                }
            }
            company.updatePayDevices(amountCount);
            
        }
  } 
}
