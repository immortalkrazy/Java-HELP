public class BinarySearch {
  public static int search(int[] numbers, int key) {
    return search(numbers, key, 0, numbers.length-1);
  }

  private static int search(int[] numbers, int key, int beginIndex, int endIndex) {
    int mid = (endIndex + beginIndex) / 2; // observe when mistakenly wrote - instead

    if (beginIndex > endIndex) return - beginIndex - 1; // base case (not foudn)
    if (numbers[mid] == key)  return mid;               // base case (found)

    if (key < numbers[mid]) { // subproblem, the same problem but smaller size
      return search(numbers, key, beginIndex, mid-1);
    } else { // subproblem, the same problem but smaller size
      return search(numbers, key, mid+1, endIndex);
    }
  }

  // slightly more efficient if written in this way
  // private static int search(int[] numbers, int key, int beginIndex, int endIndex) {
  //   if (beginIndex > endIndex) return - beginIndex - 1; // base case (not foudn)
  //
  //   int mid = (endIndex + beginIndex) / 2; // observe when mistakenly wrote - instead
  //
  //   if (numbers[mid] == key) { // base case
  //     return mid;
  //   } else if (key < numbers[mid]) { // subproblem
  //     return search(numbers, key, beginIndex, mid-1);
  //   } else {  // subproblem
  //     return search(numbers, key, mid+1, endIndex);
  //   }
  // }
}
