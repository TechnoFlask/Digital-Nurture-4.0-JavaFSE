/*
Exercise 6: Library Management System

— Search Algorithms —

• Linear Search:
  - Traverse the array from start to end.
  - Compare each element with the target.
  - No requirement for data to be sorted.

• Binary Search:
  - Works on sorted data.
  - Repeatedly divides the search interval in half.
  - Faster than linear search for large sorted datasets.

— Time Complexity —

• Linear Search:
  - Best Case: O(1) (target is first element)
  - Average/Worst Case: O(n)

• Binary Search:
  - Best Case: O(1)
  - Average/Worst Case: O(log n)

— When to Use —
- Use **linear search** for small or **unsorted** datasets.
- Use **binary search** for large, **sorted** datasets where fast lookup is needed.
*/

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Book[] books = {
                    new Book(1, "Data Structures", "Mark Allen Weiss"),
                    new Book(2, "Introduction to Algorithms", "Cormen"),
                    new Book(3, "The Pragmatic Programmer", "Andy Hunt"),
                    new Book(4, "Clean Code", "Robert C. Martin"),
                    new Book(5, "Java: The Complete Reference", "Herbert Schildt")
          };

          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter book title to search: ");
          String title = scanner.nextLine();

          System.out.println("\n--- Linear Search ---");
          int indexLinear = BookSearch.linearSearch(books, title);
          if (indexLinear != -1) {
               System.out.println("Book found: " + books[indexLinear]);
          } else {
               System.out.println("Book not found.");
          }

          System.out.println("\n--- Binary Search (after sorting) ---");
          BookSearch.sortByTitle(books);
          int indexBinary = BookSearch.binarySearch(books, title);
          if (indexBinary != -1) {
               System.out.println("Book found: " + books[indexBinary]);
          } else {
               System.out.println("Book not found.");
          }
     }
}
