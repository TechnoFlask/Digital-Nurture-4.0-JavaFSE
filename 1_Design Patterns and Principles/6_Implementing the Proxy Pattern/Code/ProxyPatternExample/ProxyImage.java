package ProxyPatternExample;

public class ProxyImage implements Image {
     private String remotePath = null;
     private RealImage realImage = null;

     public ProxyImage(String remotePath) {
          this.remotePath = remotePath;
     }

     @Override
     public void display() {
          if (realImage == null)
               realImage = new RealImage(remotePath);

          realImage.display();
     }
}
