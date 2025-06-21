package CommandPatternExample;

public class Main {
     public static void main(String[] args) {
          Invoker inv = new RemoteControl();
          Light l = new Light(inv);

          Command lOn = new LightOnCommand();
          Command lOff = new LightOffCommand();

          l.setTurnOnCommand(lOn);
          l.setTurnOffCommand(lOff);

          l.turnOn();
          l.turnOff();
     }
}