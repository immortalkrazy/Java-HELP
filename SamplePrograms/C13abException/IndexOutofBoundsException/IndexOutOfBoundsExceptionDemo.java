public class IndexOutOfBoundsExceptionDemo {
  public static void main(String[] args) {
    Circle[] circles  = new Circle[10];
    int i = 20;
    circles[i] =  new Circle();
    doSth(circles[i]);
  }

  public static void doSth(Circle c) {
    System.out.println(c.toString());
  }

}
