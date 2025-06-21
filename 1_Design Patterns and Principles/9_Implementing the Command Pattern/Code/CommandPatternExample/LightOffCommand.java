package CommandPatternExample;

public class LightOffCommand implements Command {
     @Override
     public void execute() {
          System.out.println("Turning off light.");
     }
}
