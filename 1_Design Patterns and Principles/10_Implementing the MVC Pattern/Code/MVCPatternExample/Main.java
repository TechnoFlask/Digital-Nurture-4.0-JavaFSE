package MVCPatternExample;

public class Main {
     public static void main(String[] args) {
          Student model = new Student("Jake", "235254", "A");
          StudentView view = new StudentView();

          StudentController controller = new StudentController(model, view);
          controller.updateView();

          controller.setStudentName("Maddy");
          controller.setStudentGrade("A+");
          controller.updateView();
     }
}
