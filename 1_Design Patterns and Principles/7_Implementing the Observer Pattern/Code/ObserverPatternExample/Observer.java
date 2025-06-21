package ObserverPatternExample;

public abstract class Observer {
     protected String observerName = null;

     public Observer(String name) {
          observerName = name;
     }

     public String getObserverName() {
          return observerName;
     }

     abstract void update();
}
