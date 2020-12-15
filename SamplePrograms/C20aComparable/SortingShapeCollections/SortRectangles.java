/**
 * The sample program from Chapter 13 in
 *   Liang Y Daniel, Introduction to Java Programming, 11st Edition
 * which is revised to use ArrayList
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SortRectangles {
  public static void main(String[] args) {
    /* create and initialize an ArrayList */
    ArrayList<ComparableRectangle> rectangles =
      new ArrayList<ComparableRectangle>(Arrays.asList(
        new ComparableRectangle(3.4, 5.4),
        new ComparableRectangle(13.24, 55.4),
        new ComparableRectangle(7.4, 35.4),
        new ComparableRectangle(1.4, 25.4))
      );

    /* Sort the ArrayList */
    Collections.sort(rectangles);

    /* print out the rectangles */
    for (Rectangle rectangle: rectangles) {
      System.out.print(rectangle + " ");
      System.out.println();
    }
  }
}
