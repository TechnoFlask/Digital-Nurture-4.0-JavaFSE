package MVCPatternExample;

public class Student {
     private String name, id, grade;

     public Student(String name, String id, String grade) {
          setName(name);
          setId(id);
          setGrade(grade);
     }

     public String getName() {
          return name;
     }

     public String getId() {
          return id;
     }

     public String getGrade() {
          return grade;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setId(String id) {
          this.id = id;
     }

     public void setGrade(String grade) {
          this.grade = grade;
     }
}
