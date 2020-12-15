import java.util.Arrays;
import java.util.Random;

public class BinarySearchClient {
  private static Random rng = new Random();

  public static void main(String[] args) {
    int[] numbers = makeSortedRandomArray(10, 20);

    int key = rng.nextInt(20);

    System.out.println("The array is ");
    printArray(numbers);

    System.out.println("The key to be searched is " + key);

    int found = BinarySearch.search(numbers, key);
    if (found < 0) {
      System.out.println("The key " + key + " is not found.");
    } else {
      System.out.println("The key is found at index " + found);
    }
  }

  private static int[] makeSortedRandomArray(int size, int max) {
    int[] numbers = new int[size];

    for (int i = 0; i < size; i++) {
      numbers[i] = rng.nextInt(max);
    }
    Arrays.sort(numbers);

    return numbers;
  }

  private static void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[" + i + "]: " + numbers[i]);
    }
  }
}
