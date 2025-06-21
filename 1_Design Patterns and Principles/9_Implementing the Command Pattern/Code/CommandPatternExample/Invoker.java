package CommandPatternExample;

public interface Invoker {
     void setButton1Command(Command c);

     void setButton2Command(Command c);

     void executeButton1();

     void executeButton2();
}

class RemoteControl implements Invoker {
     private Command button1Command = null;
     private Command button2Command = null;

     @Override
     public void setButton1Command(Command c) {
          button1Command = c;
     }

     @Override
     public void setButton2Command(Command c) {
          button2Command = c;
     }

     @Override
     public void executeButton1() {
          button1Command.execute();
     }

     @Override
     public void executeButton2() {
          button2Command.execute();
     }
}
