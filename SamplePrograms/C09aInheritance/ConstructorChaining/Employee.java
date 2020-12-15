public class Employee extends Person {
  public Employee() {
    this("(2) Invoking Employee(String) defined in the Employee class, an overloaded constructor.");
    System.out.println("(3) Perform Employee's initialization task.");
  }

  public Employee(String s) {
    System.out.println(s);
  }
}
