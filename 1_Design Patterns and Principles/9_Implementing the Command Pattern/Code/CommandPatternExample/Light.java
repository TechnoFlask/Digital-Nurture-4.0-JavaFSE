package CommandPatternExample;

public class Light {
     private Invoker inv = null;

     public Light(Invoker inv) {
          this.inv = inv;
     }

     public void setTurnOnCommand(Command c) {
          inv.setButton1Command(c);
     }

     public void setTurnOffCommand(Command c) {
          inv.setButton2Command(c);
     }

     public void turnOn() {
          inv.executeButton1();
     }

     public void turnOff() {
          inv.executeButton2();
     }
}
