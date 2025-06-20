package SingletonPatternExample;

public class Logger {
     private static Logger instance = null;

     private Logger() {
     }

     public static Logger getInstance() {
          if (instance == null)
               instance = new Logger();
          return instance;
     }

     public void logToFile() {
          System.out.println("Logging to file.....");
     }

     public void logToString(String content, StringBuffer sb) {
          System.out.println("Logging to string.....");
          sb.append(String.format("%s\n", content));
     }
}
