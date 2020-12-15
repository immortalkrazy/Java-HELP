public class TestCircle {
  public static void main(String[] args) {
    Circle myCircle = new Circle (1.0);
    int n = 5;
    System.out.println("----------printCircle(myCircle, n)-------------");
    printCircle(myCircle, n);
    System.out.println("----------printCircle(myCircle)-------------");
    printCircle(myCircle);
  }

  public static void printCircle(Circle c) {
    System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
  }



  public static void printCircle(Circle c, int times) {
    System.out.println("Radius \t\t Area");
    for (int i = 0; i < times; i ++) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
    }
  }
}
