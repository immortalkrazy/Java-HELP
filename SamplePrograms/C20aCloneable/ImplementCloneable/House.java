/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
  private int id;
  private double area;
  private java.util.Date whenBuilt;

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }

  public int getId() {
    return id;
  }

  public double getArea() {
    return area;
  }

  public Date getWhenBuilt() {
    return whenBuilt;
  }

  // Cloneable has no method, but we ought to override the clone method
  public Object clone() {
    // Perform a shallow copy
    House houseClone = new House(id, area);
    // Deep copy on whenBuilt
    houseClone.whenBuilt = new java.util.Date();
    houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
    return houseClone;
  }

  public int compareTo(House o) {
    return Double.compare(area, o.area);
  }
}
