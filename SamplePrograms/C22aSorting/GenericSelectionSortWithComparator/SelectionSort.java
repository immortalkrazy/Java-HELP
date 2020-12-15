/**
 * Remark:
 * This design has some undesired property, for instance, when does a runtime error may
 * occur, and when? Is it possible to rewrite it using the java.util.Comparable interface
 * instead of the java.util.Comparator interface?
 *
 * We shall take a look at this progrma agian when we discuss "generics".
 */

import java.util.Comparator;

public class SelectionSort {
  public static void sort(Object[] objects, Comparator<Object> comparator) {
    // write a helper function/method that can be decomposed recursively into subproblems
    sort(objects, comparator, 0);
  }

  // Subproblem 1
  private static void swapSmallest(Object[] objects, Comparator<Object> comparator, int startIndex) {
    Object minimum = objects[startIndex];
    int minIndex = startIndex;
    // find the minimum
    for (int i=startIndex+1; i<objects.length; i++) {
      // Question: does it hurt if we change < to <=?
      if (comparator.compare(objects[i], minimum) < 0) {
        minimum = objects[i];
        minIndex = i;
      }
    }

    // swap the minimum and the first
    if (startIndex != minIndex) {
      Object tmp = objects[startIndex];
      objects[startIndex] = objects[minIndex];
      objects[minIndex] = tmp;
    }
  }

  // Subproblem 2
  private static void sort(Object[] objects, Comparator<Object> comparator, int startIndex) {
    /* divide the problem into subproblem
     * 1. find the smallest from the numbers, and exchange it with the very first
     *    number in the array.
     * 2. (recursion) sort the subarray, i.e., the array excluding the first element
     *    base case: the size of the array down to 0 (or 1?)
     */
     if ((objects.length - 1) - startIndex == 0) return; // base case

     swapSmallest(objects, comparator, startIndex);
     sort(objects, comparator, startIndex + 1);
  }
}
