package ObserverPatternExample;

public class MobileApp extends Observer {
     public MobileApp(String name) {
          super(name);
     }

     @Override
     public void update() {
          System.out.println("MobileApp observer " + observerName + " is being notified");
          System.out.println("Updating.....");
     }
}