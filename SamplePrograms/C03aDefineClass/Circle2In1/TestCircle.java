class TestCircle {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

    Circle c2 = new Circle(25);
    System.out.println("The area of the circle of radius " + c2.getRadius() + " is " + c2.getArea());

    Circle c3 = new Circle(125);
    System.out.println("The area of the circle of radius " + c3.getRadius() + " is " + c3.getArea());
  }
}

class Circle {
  double radius = 1;

  Circle() {
  }

  Circle(double newRadius) {
    radius = newRadius;
  }

  double getRadius() {
    return radius;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }

  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  void setRadius(double newRadius) {
    radius = newRadius;
  }
}
