package ObserverPatternExample;

public class WebApp extends Observer {
     public WebApp(String name) {
          super(name);
     }

     @Override
     public void update() {
          System.out.println("Webapp observer " + observerName + " is being notified");
          System.out.println("Updating.....");
     }
}
