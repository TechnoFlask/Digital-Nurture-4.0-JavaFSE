/*
Exercise 4: Employee Management System

— Array Representation in Memory —
- Arrays are stored in **contiguous memory locations**.
- This allows **constant-time (O(1))** access to elements using their index.
- Arrays are efficient in terms of memory and lookup speed.

— Time Complexity of Operations —
• Add      : O(1) — if space is available.
• Search   : O(n) — linear scan through array.
• Traverse : O(n) — print all elements.
• Delete   : O(n) — due to shifting elements after deletion.

— Limitations of Arrays —
1. **Fixed Size**: Once declared, cannot grow dynamically.
2. **Inefficient Deletion**: Elements must be shifted, leading to O(n) complexity.
3. **No Built-in Resizing**: Unlike dynamic structures like `ArrayList`.

— When to Use Arrays —
- When size is known in advance and doesn’t change frequently.
- When fast indexed access (O(1)) is required.
*/

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          EmployeeManager manager = new EmployeeManager(100);
          Scanner scanner = new Scanner(System.in);

          while (true) {
               System.out.println("\nEmployee Menu:");
               System.out.println("1. Add Employee");
               System.out.println("2. Search Employee");
               System.out.println("3. Delete Employee");
               System.out.println("4. Show All Employees");
               System.out.println("5. Exit");
               System.out.print("Choice: ");
               int choice = scanner.nextInt();

               switch (choice) {
                    case 1 -> {
                         System.out.print("Enter Employee ID: ");
                         int id = scanner.nextInt();
                         scanner.nextLine(); // consume newline
                         System.out.print("Enter Name: ");
                         String name = scanner.nextLine();
                         System.out.print("Enter Position: ");
                         String position = scanner.nextLine();
                         System.out.print("Enter Salary: ");
                         double salary = scanner.nextDouble();
                         if (manager.addEmployee(new Employee(id, name, position, salary))) {
                              System.out.println("Employee added.");
                         } else {
                              System.out.println("Employee list is full.");
                         }
                    }
                    case 2 -> {
                         System.out.print("Enter Employee ID to search: ");
                         int id = scanner.nextInt();
                         Employee emp = manager.searchEmployee(id);
                         if (emp != null) {
                              System.out.println("Employee found: " + emp);
                         } else {
                              System.out.println("Employee not found.");
                         }
                    }
                    case 3 -> {
                         System.out.print("Enter Employee ID to delete: ");
                         int id = scanner.nextInt();
                         if (manager.deleteEmployee(id)) {
                              System.out.println("Employee deleted.");
                         } else {
                              System.out.println("Employee not found.");
                         }
                    }
                    case 4 -> manager.traverseEmployees();
                    case 5 -> {
                         System.out.println("Exiting.");
                         scanner.close();
                         return;
                    }
                    default -> System.out.println("Invalid choice.");
               }
          }
     }
}
