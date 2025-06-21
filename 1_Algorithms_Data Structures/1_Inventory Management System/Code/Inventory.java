import java.util.HashMap;

public class Inventory {
     private HashMap<Integer, Product> products;

     public Inventory() {
          products = new HashMap<>();
     }

     public void addProduct(Product product) {
          products.put(product.getProductId(), product);
     }

     public boolean updateProduct(int productId, int newQuantity, double newPrice) {
          Product product = products.get(productId);
          if (product != null) {
               product.setQuantity(newQuantity);
               product.setPrice(newPrice);
               return true;
          }
          return false;
     }

     public boolean deleteProduct(int productId) {
          return products.remove(productId) != null;
     }

     public void displayAllProducts() {
          if (products.isEmpty()) {
               System.out.println("Inventory is empty.");
          } else {
               for (Product p : products.values()) {
                    System.out.println(p);
               }
          }
     }
}
