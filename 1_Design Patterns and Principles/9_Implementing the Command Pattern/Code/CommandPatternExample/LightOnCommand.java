package CommandPatternExample;

public class LightOnCommand implements Command {
     @Override
     public void execute() {
          System.out.println("Turning on light.");
     }
}
