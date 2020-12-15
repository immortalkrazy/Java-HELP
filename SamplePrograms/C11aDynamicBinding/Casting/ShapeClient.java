/**
 * From Chapter 11 in Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

public class ShapeClient {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
    displayShapeObject(new Circle(1, "red", false));
    displayShapeObject(new Rectangle(1, 1, "black", true));
  }

  /** Display geometric object properties */
  public static void displayShapeObject(GeometricObject object) {
    System.out.println("Created on " + object.getDateCreated() +
      ". Color is " + object.getColor());
  }
}
