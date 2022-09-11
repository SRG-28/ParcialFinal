package Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grupo G
 */
//CASO 1: Weather Monitoring Station
/*Se utilizó el patrón de diseño de comportamiento Observer ya que en este caso los componentes interactúan entre sí.
Se creo un componente maestro que notifica su cambio a los demás componentes del sistema. Se seleccionó el patrón Observer ya que se requiere que los 
objetos dependientes sean actualizados automáticamente cada vez que un objeto cambia de estado.
Para poder implementar este patrón de manera adecuada se crearon cuatro clases básicas. Primero se creo una interface llamada Observer con un método update y un método print,
igualmente se creo una interface Subject con tres métodos: attach, detach y notify. 
También se creo una clase ConcreteObserver que se encarga de mantener el estado de un observador en concreto y actualizarlo. 
Por último se crearon 3 clases ConcreteSubject que obtiene y enviar el estado del sujeto.*/

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherSubject wSubject = new WeatherSubject();
        CurrentConditions cc = new CurrentConditions();
        WeatherStats ws = new WeatherStats();
        Forecast fc = new Forecast();
        wSubject.attach(cc);
        wSubject.attach(ws);
        wSubject.attach(fc);
        Weather w1 = new Weather(7,25,22);
        Weather w2 = new Weather(25,28,30);
        Weather w3 = new Weather(38,40,39);
         wSubject.notify(w1);
         wSubject.notify(w2);
         wSubject.notify(w3);
         
          System.out.println("------------------------------");
          System.out.println("------WeatherData Device------");
          System.out.println("------------------------------\n");
          System.out.println("SET 1");
         cc.print();
         ws.print();
         fc.print();
         
         System.out.println("\nSET 2:HIBRIDO\n");
         wSubject.detach(cc);
         wSubject.detach(ws);
         wSubject.detach(fc);
         CurrentConditions cc2 = new CurrentConditions();
         WeatherStats ws2 = new WeatherStats();
         Forecast fc2 = new Forecast();
         wSubject.attach(cc2);
         wSubject.attach(ws2);
         wSubject.attach(fc2);
         Hibrido h = new Hibrido();
         wSubject.notify( h.hibrido(w1, w2));
         wSubject.notify(h.hibrido(w2, w3));
         wSubject.notify(h.hibrido(w1, w3));
         cc2.print();
         ws2.print();
         fc2.print();
    }
    
}
