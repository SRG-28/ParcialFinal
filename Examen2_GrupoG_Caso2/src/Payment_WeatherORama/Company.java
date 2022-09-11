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
public class Company {
    String name;
    int actualDevices;
    int pastDevices;

    public Company(String name) {
        this.name = name;
    }

    
    public Company(String name, int actualDevices, int pastDevices) {
        this.name = name;
        this.actualDevices = actualDevices;
        this.pastDevices = pastDevices;
    }

    //Getters
    public String getName() {return name;}
    public int getActualDevices() {return actualDevices;}
    public int getPastDevices() { return pastDevices;}
    
    //setters
    public void setName(String name) {this.name = name;}
    public void setActualDevices(int actualDevices) {this.actualDevices = actualDevices;}
    public void setPastDevices(int pastDevices) {this.pastDevices = pastDevices;}
    
    //tostring
    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", devices=" + actualDevices + ", newDevices=" + pastDevices + '}';}
    
    public void addDevices(double devices){
        this.pastDevices=actualDevices;
        this.actualDevices+=devices;
    }
    
    public void subDevices(double devices){
        this.pastDevices=actualDevices;
        this.actualDevices-=devices;
        if(this.actualDevices<0){
            this.actualDevices=0;
        }
    }
    
    public void updatePayDevices(double amount){
        System.out.println("Amount to pay this month is: $"+ amount);
    }
}
