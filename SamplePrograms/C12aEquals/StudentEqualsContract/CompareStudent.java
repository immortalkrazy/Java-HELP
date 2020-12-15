public class CompareStudent {
  public static void main(String[] args) {
    Student s1 = new Student(100, "John Doe");
    Student s2 = new Student(100, "John Doe");

    System.out.println("s1: " + s1.toString());
    System.out.println("s2: " + s2.toString());
    System.out.println("s1.equals(s2): " + s1.equals(s2));
    // is the contract broken?
    System.out.println("s1.hashCode(): " + s1.hashCode() + " s1.hashCode(): " + s2.hashCode());
    System.out.println("s1.hashCode() == s1.hashCode(): " + (s1.hashCode() == s2.hashCode()));

    System.out.println("---------------------------------\n\n");

    s2 = new Student(101, "Jane Doe");

    System.out.println("s1: " + s1.toString());
    System.out.println("s2: " + s2.toString());
    System.out.println("s1.equals(s2): " + s1.equals(s2));
    // is the contract broken?
    System.out.println("s1.hashCode(): " + s1.hashCode() + " s1.hashCode(): " + s2.hashCode());
    System.out.println("s1.hashCode() == s1.hashCode(): " + (s1.hashCode() == s2.hashCode()));
  }
}
