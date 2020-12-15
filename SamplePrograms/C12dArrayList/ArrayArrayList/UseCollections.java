import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UseCollections {
  public static void main(String[] args) {
    minmax();
    shuffle();
  }

  public static void minmax() {
    String[] array = {"red", "green", "blue"};
    System.out.println("The array is " + String.join(", ", array));
    System.out.println("MIN of the array is " +
    Collections.max(new ArrayList<String>(Arrays.asList(array))));

    System.out.println("MAX of the array is " +
      Collections.min(new ArrayList<String>(Arrays.asList(array))));
  }

  public static void shuffle() {
    Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
    System.out.println("Before shuffle: " + Arrays.toString(array));
    ArrayList<Integer> list = new  ArrayList<>(Arrays.asList(array));
    java.util.Collections.shuffle(list);
    System.out.println("After shuffle: " + list.toString());
  }
}
