class Circle {
  static final double SMALL_RADIUS = 5.0;
  static final double MEDIUM_RADIUS = 25.0;
  static final double LARGE_RADIUS = 125.0;

  double radius = 1;

  static int numberOfObjects = 0;

  Circle() {
    numberOfObjects ++;
  }

  Circle(double newRadius) {
    radius = newRadius;
    numberOfObjects ++;
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

  static int getNumberOfObjects() {
    return numberOfObjects;
  }
}
