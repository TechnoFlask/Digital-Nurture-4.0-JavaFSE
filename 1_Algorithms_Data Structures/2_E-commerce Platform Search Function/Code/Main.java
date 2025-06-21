/*
Exercise 2: E-commerce Platform Search Function

— Understand Asymptotic Notation —

Big O Notation:
Big O describes the upper bound of an algorithm's running time relative to input size.
It helps us compare algorithm performance independent of hardware.

Examples:
- O(1): Constant time — e.g., accessing an element by index
- O(n): Linear time — e.g., traversing a list
- O(log n): Logarithmic time — e.g., binary search
- O(n log n): Sorting algorithms like Merge Sort

Best, Average, and Worst Case:
- Best Case: Fastest scenario (e.g., target is at start in linear search)
- Average Case: Typical case, useful for realistic analysis
- Worst Case: Slowest case (e.g., target not present)

— Time Complexity Comparison —

Linear Search:
• Time Complexity: O(n)
• Best Case: O(1), if target is at the start
• Worst Case: O(n), if target is at the end or not present

Binary Search (on sorted array):
• Time Complexity: O(log n)
• Requires the array to be sorted beforehand
• Best Case: O(1), if target is at the middle
• Worst Case: O(log n)

— Conclusion —
• Binary Search is better for large, sorted datasets due to its O(log n) performance.
• Linear Search is simple and works on unsorted data.
• In an e-commerce platform, products should be sorted and indexed to support efficient binary search.

*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Product[] products = {
                    new Product(101, "Laptop", "Electronics"),
                    new Product(102, "Shirt", "Apparel"),
                    new Product(103, "Book", "Education"),
                    new Product(104, "Phone", "Electronics"),
                    new Product(105, "Shoes", "Footwear")
          };

          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter product name to search: ");
          String searchName = scanner.nextLine();

          System.out.println("\n--- Linear Search ---");
          int indexLinear = Search.linearSearch(products, searchName);
          if (indexLinear != -1) {
               System.out.println("Product found: " + products[indexLinear]);
          } else {
               System.out.println("Product not found.");
          }

          System.out.println("\n--- Binary Search ---");

          Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
          int indexBinary = Search.binarySearch(products, searchName);
          if (indexBinary != -1) {
               System.out.println("Product found: " + products[indexBinary]);
          } else {
               System.out.println("Product not found.");
          }
     }
}
