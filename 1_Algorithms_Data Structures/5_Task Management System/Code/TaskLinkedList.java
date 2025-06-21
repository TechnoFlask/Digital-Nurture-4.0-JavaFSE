public class TaskLinkedList {
     public class TaskNode {
          Task task;
          TaskNode next;

          public TaskNode(Task task) {
               this.task = task;
               this.next = null;
          }
     }

     private TaskNode head;

     public void addTask(Task task) {
          TaskNode newNode = new TaskNode(task);
          if (head == null) {
               head = newNode;
          } else {
               TaskNode current = head;
               while (current.next != null) {
                    current = current.next;
               }
               current.next = newNode;
          }
     }

     public Task searchTask(int taskId) {
          TaskNode current = head;
          while (current != null) {
               if (current.task.getTaskId() == taskId) {
                    return current.task;
               }
               current = current.next;
          }
          return null;
     }

     public boolean deleteTask(int taskId) {
          if (head == null)
               return false;

          if (head.task.getTaskId() == taskId) {
               head = head.next;
               return true;
          }

          TaskNode current = head;
          while (current.next != null) {
               if (current.next.task.getTaskId() == taskId) {
                    current.next = current.next.next;
                    return true;
               }
               current = current.next;
          }

          return false;
     }

     public void traverseTasks() {
          if (head == null) {
               System.out.println("No tasks found.");
               return;
          }

          TaskNode current = head;
          while (current != null) {
               System.out.println(current.task);
               current = current.next;
          }
     }
}
