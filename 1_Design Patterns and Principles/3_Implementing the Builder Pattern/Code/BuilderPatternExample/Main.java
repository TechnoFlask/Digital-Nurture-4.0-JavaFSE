package BuilderPatternExample;

public class Main {
     public static void main(String[] args) {
          Computer c = new Computer.Builder().build();
          System.out.println(c);

          c = new Computer.Builder()
                    .setCpu("Intel i9-13900K")
                    .setRam(64)
                    .build();
          System.out.println(c);

          c = new Computer.Builder()
                    .setCpu("Intel Pentium 4")
                    .setRam(2)
                    .setStorage(200)
                    .build();
          System.out.println(c);
     }
}
