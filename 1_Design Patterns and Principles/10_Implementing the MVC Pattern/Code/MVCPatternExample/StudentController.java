package MVCPatternExample;

public class StudentController {
     Student model = null;
     StudentView view = null;

     public StudentController(Student s, StudentView sv) {
          model = s;
          view = sv;
     }

     public void setStudentName(String name) {
          model.setName(name);
     }

     public void setStudentId(String id) {
          model.setId(id);
     }

     public void setStudentGrade(String grade) {
          model.setGrade(grade);
     }

     public String getStudentName() {
          return model.getName();
     }

     public String getStudentId() {
          return model.getId();
     }

     public String getStudentGrade() {
          return model.getGrade();
     }

     public void updateView() {
          view.displayStudentDetails(getStudentName(), getStudentId(), getStudentGrade());
     }
}
