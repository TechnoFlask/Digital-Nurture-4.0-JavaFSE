/*
Exercise 1: Inventory Management System

— Understand the Problem —
Data structures and algorithms are essential in handling large inventories because:
1. They ensure efficient **search, insert, update, and delete** operations, especially when data grows large.
2. Algorithms determine the speed of operations; optimized algorithms improve performance and scalability.
3. A good data structure reduces the complexity of data management and code maintenance.

Suitable Data Structures:
- **HashMap** is ideal here because:
  • It allows quick access using keys (we use `productId` as the key).
  • Supports constant-time (O(1)) average operations for add, update, delete, and lookup.
  • Scales well with a growing number of products.

— Analysis —
Time Complexity of Operations using HashMap:
• Add Product     : O(1) average, O(n) worst-case (due to rehashing)
• Update Product  : O(1) average
• Delete Product  : O(1) average
• Display All     : O(n) — we must iterate through all stored products

Optimization Notes:
- Ensure the `productId` is unique to maintain HashMap efficiency.
- If ordering is required (e.g., sorted by productId), use TreeMap instead (O(log n)).
- For very large datasets, consider using databases with indexes for persistence and faster search.

*/

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Inventory inventory = new Inventory();
          Scanner scanner = new Scanner(System.in);

          while (true) {
               System.out.println("\nInventory Menu:");
               System.out.println("1. Add Product");
               System.out.println("2. Update Product");
               System.out.println("3. Delete Product");
               System.out.println("4. Show Inventory");
               System.out.println("5. Exit");
               System.out.print("Choice: ");
               int choice = scanner.nextInt();

               switch (choice) {
                    case 1 -> {
                         System.out.print("Enter Product ID: ");
                         int id = scanner.nextInt();
                         scanner.nextLine();
                         System.out.print("Enter Product Name: ");
                         String name = scanner.nextLine();
                         System.out.print("Enter Quantity: ");
                         int qty = scanner.nextInt();
                         System.out.print("Enter Price: ");
                         double price = scanner.nextDouble();
                         inventory.addProduct(new Product(id, name, qty, price));
                         System.out.println("Product added.");
                    }
                    case 2 -> {
                         System.out.print("Enter Product ID to update: ");
                         int id = scanner.nextInt();
                         System.out.print("Enter new Quantity: ");
                         int qty = scanner.nextInt();
                         System.out.print("Enter new Price: ");
                         double price = scanner.nextDouble();
                         if (inventory.updateProduct(id, qty, price)) {
                              System.out.println("Product updated.");
                         } else {
                              System.out.println("Product not found.");
                         }
                    }
                    case 3 -> {
                         System.out.print("Enter Product ID to delete: ");
                         int id = scanner.nextInt();
                         if (inventory.deleteProduct(id)) {
                              System.out.println("Product deleted.");
                         } else {
                              System.out.println("Product not found.");
                         }
                    }
                    case 4 -> inventory.displayAllProducts();
                    case 5 -> {
                         System.out.println("Exiting.");
                         return;
                    }
                    default -> System.out.println("Invalid choice.");
               }
          }
     }
}
