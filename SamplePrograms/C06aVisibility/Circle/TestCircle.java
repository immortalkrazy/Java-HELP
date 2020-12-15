public class TestCircle {
  public static void main(String[] args) {
    System.out.println("Before creating any Circle objects:");
    System.out.println("The number of Circle objects has been created is " + Circle.getNumberOfObjects());

    Circle c1 = new Circle();

    System.out.println("After creating c1:");
    System.out.println("The number of Circle objects has been created is " + Circle.getNumberOfObjects());

    Circle c2 = new Circle(Circle.SMALL_RADIUS);
    System.out.println("After creating c2:");
    System.out.println("The number of Circle objects has been created is " + Circle.getNumberOfObjects());
  }
}
