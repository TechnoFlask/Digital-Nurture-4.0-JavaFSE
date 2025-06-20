package SingletonPatternExample;

public class Main {
     public static void main(String[] args) {
          Logger lg = Logger.getInstance();
          StringBuffer sb = new StringBuffer();
          System.out.println("String: " + sb);

          lg.logToFile();
          lg.logToString("hello world", sb);
          System.out.println("String: " + sb);
          lg.logToString("how are you?", sb);
          System.out.println("String: " + sb);
     }
}
