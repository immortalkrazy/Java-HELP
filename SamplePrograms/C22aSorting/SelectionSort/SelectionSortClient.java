import java.util.Random;

public class SelectionSortClient {
  public static void main(String[] args) {
    int[] numbers = makeRandomArray(10);

    System.out.println("Input Array: ");
    printArray(numbers);

    SelectionSort.sort(numbers);

    System.out.println("Sorted Array: ");
    printArray(numbers);
  }


  private static int[] makeRandomArray(int size) {
    Random rng = new Random();
    int[] numbers = new int[size];
    for (int i=0; i<numbers.length; i++) {
      numbers[i] = rng.nextInt(100);
    }
    return numbers;
  }

  private static void printArray(int[] numbers) {
    for(int n: numbers) {
      System.out.println(n);
    }
  }
}
