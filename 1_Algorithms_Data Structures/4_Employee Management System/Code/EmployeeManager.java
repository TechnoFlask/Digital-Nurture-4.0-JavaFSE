public class EmployeeManager {
     private Employee[] employees;
     private int size;

     public EmployeeManager(int capacity) {
          employees = new Employee[capacity];
          size = 0;
     }

     public boolean addEmployee(Employee employee) {
          if (size >= employees.length) {
               return false;
          }
          employees[size++] = employee;
          return true;
     }

     public Employee searchEmployee(int employeeId) {
          for (int i = 0; i < size; i++) {
               if (employees[i].getEmployeeId() == employeeId) {
                    return employees[i];
               }
          }
          return null;
     }

     public boolean deleteEmployee(int employeeId) {
          for (int i = 0; i < size; i++) {
               if (employees[i].getEmployeeId() == employeeId) {
                    for (int j = i; j < size - 1; j++) {
                         employees[j] = employees[j + 1];
                    }
                    employees[size - 1] = null;
                    size--;
                    return true;
               }
          }
          return false;
     }

     public void traverseEmployees() {
          if (size == 0) {
               System.out.println("No employees in the system.");
               return;
          }
          for (int i = 0; i < size; i++) {
               System.out.println(employees[i]);
          }
     }
}
