package ObserverPatternExample;

public class Main {
     public static void main(String[] args) {
          Stock sm = new StockMarket();
          Observer o1 = new WebApp("o1");
          sm.register(o1);
          sm.notifyObservers();

          Observer o2 = new MobileApp("o2");
          Observer o4 = new WebApp("o4");
          sm.register(o2);
          sm.register(o4);
          sm.notifyObservers();

          sm.deregister(o4);
          sm.notifyObservers();
     }
}
