package ObserverPatternExample;

import java.util.HashSet;

public class StockMarket implements Stock {
     private HashSet<Observer> observers = null;

     public StockMarket() {
          observers = new HashSet<>();
     }

     @Override
     public void register(Observer o) {
          System.out.println("Registering observer " + o.getObserverName());
          observers.add(o);
     }

     @Override
     public void deregister(Observer o) {
          System.out.println("Deregistering observer " + o.getObserverName());
          observers.remove(o);
     }

     @Override
     public void notifyObservers() {
          System.out.println("Notifying current observers");
          observers.forEach((o) -> o.update());
     }
}
