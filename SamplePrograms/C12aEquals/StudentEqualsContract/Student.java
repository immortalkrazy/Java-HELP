import java.util.Objects;

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

  public boolean equals(Object theOther) {
    if (theOther instanceof Student) {
      return id == ((Student)theOther).id && name.equals(((Student)theOther).name);
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects.hash(id, name);
  }
}
