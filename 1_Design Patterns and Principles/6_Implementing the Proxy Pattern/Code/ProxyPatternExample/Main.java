package ProxyPatternExample;

public class Main {
     public static void main(String[] args) {
          Image i;
          i = new RealImage("http://localhost:3000");
          i.display();
          System.out.println();

          i = new ProxyImage("http://localhost:3000");
          i.display();
          i.display();
          i.display();
          i.display();
     }
}
