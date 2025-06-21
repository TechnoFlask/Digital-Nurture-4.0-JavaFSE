package ProxyPatternExample;

public class RealImage implements Image {
     private String imageContent = null;

     public RealImage(String remotePath) {
          System.out.println("Loading image from path " + remotePath);
          try {
               Thread.sleep(2000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
          System.out.println("Loaded image");
          imageContent = "This is some random image content";
     }

     @Override
     public void display() {
          System.out.println(imageContent);
     }
}
