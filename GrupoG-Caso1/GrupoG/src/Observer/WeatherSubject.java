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
public class WeatherSubject implements Subject{
    private final List<Observer> observer = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observer.add(o);
    }
    @Override
    public void detach(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notify(Weather w) {
        System.out.println("Temperature: " + w.getTemperature());
        System.out.println("Humidity: " + w.getHumidity());
        System.out.println("Barometric Pressure: " + w.getBarometricPressure() + "\n");
        observer.forEach((o) -> {
           o.update(w);
        });
    }
}
