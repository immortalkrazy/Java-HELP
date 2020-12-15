import java.util.ArrayList;

public class Course {
  public final static double REQUIRED_MIN_GPA = 2.5;
  private ArrayList<Student> students;

  public Course() {
    students = new ArrayList<Student>();
  }

  public boolean addStudent(Student student) {
    double gpa = student.getGPA();
    if (gpa < REQUIRED_MIN_GPA) {
      return false;
    } else {
      students.add(student);
      return true;
    }
  }
}
