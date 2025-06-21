/*
Exercise 5: Task Management System

— Understanding Linked Lists —

• Singly Linked List:
  - Each node stores data and a pointer to the next node.
  - Allows efficient insertion and deletion at any position.
  - Cannot traverse backward.

• Doubly Linked List:
  - Each node has two pointers: one to next and one to previous node.
  - Allows bidirectional traversal.
  - Uses more memory due to extra pointer.

— Time Complexity (Singly Linked List) —

• Add to end     : O(n) — need to traverse to the end
• Search by ID   : O(n) — linear traversal
• Traverse all   : O(n)
• Delete by ID   : O(n) — search then remove

— Advantages Over Arrays —

✓ Dynamic size: Grows/shrinks without resizing or reallocation
✓ Easier insertions/deletions: Especially in middle of list
✗ Slower indexed access: No random access like arrays (O(n) vs O(1))

Use linked lists when:
- The number of elements is dynamic
- Insertions/deletions are frequent and array shifting is costly
*/

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          TaskLinkedList taskList = new TaskLinkedList();
          Scanner scanner = new Scanner(System.in);

          while (true) {
               System.out.println("\nTask Menu:");
               System.out.println("1. Add Task");
               System.out.println("2. Search Task");
               System.out.println("3. Delete Task");
               System.out.println("4. Show All Tasks");
               System.out.println("5. Exit");
               System.out.print("Choice: ");
               int choice = scanner.nextInt();

               switch (choice) {
                    case 1 -> {
                         System.out.print("Enter Task ID: ");
                         int id = scanner.nextInt();
                         scanner.nextLine();
                         System.out.print("Enter Task Name: ");
                         String name = scanner.nextLine();
                         System.out.print("Enter Status: ");
                         String status = scanner.nextLine();
                         taskList.addTask(new Task(id, name, status));
                         System.out.println("Task added.");
                    }
                    case 2 -> {
                         System.out.print("Enter Task ID to search: ");
                         int id = scanner.nextInt();
                         Task task = taskList.searchTask(id);
                         if (task != null) {
                              System.out.println("Task found: " + task);
                         } else {
                              System.out.println("Task not found.");
                         }
                    }
                    case 3 -> {
                         System.out.print("Enter Task ID to delete: ");
                         int id = scanner.nextInt();
                         if (taskList.deleteTask(id)) {
                              System.out.println("Task deleted.");
                         } else {
                              System.out.println("Task not found.");
                         }
                    }
                    case 4 -> taskList.traverseTasks();
                    case 5 -> {
                         System.out.println("Exiting.");
                         return;
                    }
                    default -> System.out.println("Invalid choice.");
               }
          }
     }
}
