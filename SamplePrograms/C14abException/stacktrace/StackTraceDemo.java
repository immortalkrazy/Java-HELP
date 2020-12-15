public class StackTraceDemo {
  public static void main(String[] args) {
    StackTraceDemo demo  = new StackTraceDemo();
    demo.doSth();
  }

  public void doSth() {
    Course course =  new Course();
    Student student = new Student();
    course.addStudent(student); 
  }
}
