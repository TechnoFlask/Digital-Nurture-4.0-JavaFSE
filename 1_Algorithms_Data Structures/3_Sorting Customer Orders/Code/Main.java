/*
Exercise 3: Sorting Customer Orders

— Understand Sorting Algorithms —

• Bubble Sort:
  - Simple, compares adjacent elements and swaps them.
  - Time Complexity: O(n^2) for best, average, and worst case.
  - Not suitable for large datasets.

• Insertion Sort:
  - Builds the sorted list one element at a time.
  - Time Complexity: O(n^2), but O(n) best case if data is nearly sorted.

• Merge Sort:
  - Divide-and-conquer, splits array and merges sorted halves.
  - Time Complexity: O(n log n) for all cases.
  - Requires additional space.

• Quick Sort:
  - Divide-and-conquer, selects a pivot and partitions around it.
  - Time Complexity:
    - Best Case: O(n log n)
    - Average Case: O(n log n)
    - Worst Case: O(n^2) (when pivot selection is poor)
  - Fast and in-place (uses no extra array).

— Comparison —
• Bubble Sort is inefficient for large datasets due to O(n^2) time.
• Quick Sort is faster on average and suitable for real-world use.
• Quick Sort is preferred for sorting customer orders on an e-commerce platform.

*/

public class Main {
     public static void main(String[] args) {
          Order[] orders = {
                    new Order(1, "Alice", 2500.50),
                    new Order(2, "Bob", 890.00),
                    new Order(3, "Charlie", 1350.75),
                    new Order(4, "Diana", 5000.00),
                    new Order(5, "Eve", 1100.00)
          };

          System.out.println("--- Original Orders ---");
          printOrders(orders);

          System.out.println("\n--- Bubble Sort by totalPrice ---");
          Sort.bubbleSort(orders);
          printOrders(orders);

          // Reinitialize to original order for fair Quick Sort demo
          orders = new Order[] {
                    new Order(1, "Alice", 2500.50),
                    new Order(2, "Bob", 890.00),
                    new Order(3, "Charlie", 1350.75),
                    new Order(4, "Diana", 5000.00),
                    new Order(5, "Eve", 1100.00)
          };

          System.out.println("\n--- Quick Sort by totalPrice ---");
          Sort.quickSort(orders, 0, orders.length - 1);
          printOrders(orders);
     }

     private static void printOrders(Order[] orders) {
          for (Order order : orders) {
               System.out.println(order);
          }
     }
}
