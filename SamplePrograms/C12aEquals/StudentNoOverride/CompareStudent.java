public class CompareStudent {
  public static void main(String[] args) {
    Student s1 = new Student(100, "John Doe");
    Student s2 = new Student(100, "John Doe");

    System.out.println("s1.equals(s2): " + s1.equals(s2));
  }
}
