public class Student {
  public double getGPA() {
    throw new IllegalStateException("No way to compute GPA if no courses.");
  }
}
