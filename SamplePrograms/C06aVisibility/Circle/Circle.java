public class Circle {
  public static final double SMALL_RADIUS = 5.0;
  public static final double MEDIUM_RADIUS = 25.0;
  public static final double LARGE_RADIUS = 125.0;

  private double radius = 1;

  private static int numberOfObjects = 0;

  public Circle() {
    numberOfObjects ++;
  }

  public Circle(double newRadius) {
    radius = newRadius;
    numberOfObjects ++;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }
}
