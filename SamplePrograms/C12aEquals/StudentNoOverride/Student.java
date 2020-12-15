public class Student {
  private int id;
  private String name;

  public Student(int studentId, String studentName) {
    id = studentId;
    name = studentName;
  }

  public String toString() {
    return "Student[" + "id=" + id + ",name=\"" + name + "\"]";
  }
}
