public class TotalArea {
  public static void main(String[] args) {
    Circle[] circleArray;

    circleArray = createCircleArray(5);

    printCircleArray(circleArray);
  }

  public static Circle[] createCircleArray(int n) {
    Circle[] circleArray = new Circle[n];

    for (int i=0; i<n; i++) {
      circleArray[i] = new Circle(Math.random() * 100);
    }

    return circleArray;
  }

  public static void printCircleArray(Circle[] circleArray) {
    System.out.printf("%-30s%-15s\n", "Radius", "Area");
    for (int i=0; i<circleArray.length; i++) {
      System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
    }

    System.out.printf("%-30s%-15f\n", "The total area of the circles is ", sumArea(circleArray));
  }

  public static double sumArea(Circle[] circleArray) {
    double sum = 0;

    for (int i=0; i<circleArray.length; i++) {
      sum += circleArray[i].getArea();
    }

    return sum;
  }
}
