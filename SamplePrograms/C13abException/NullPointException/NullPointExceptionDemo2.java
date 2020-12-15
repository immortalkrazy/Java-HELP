public class NullPointExceptionDemo2 {
  public static void main(String[] args) {
    Circle[] circles  = new Circle[10];
    // circles[0] =  new Circle();
    doSth(circles[0]);
  }

  public static void doSth(Circle c) {
    System.out.println(c.toString());
  }

}
