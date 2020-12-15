import java.util.Arrays;

public class SortingArrays {
  public static void main(String[] args) {
    // Create an Integer array
    Integer[] intArray = {
      Integer.valueOf(2), Integer.valueOf(4),  Integer.valueOf(3)
    };

    // Create a Double array
    Double[] doubleArray = {
      Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)
    };

    // Create a Character array
    Character[] charArray = {
      Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')
    };

    // Create a String array
    String[] stringArray = {"Tom", "John", "Fred"};

    // Sort the arrays
    Arrays.sort(intArray);
    Arrays.sort(doubleArray);
    Arrays.sort(charArray);
    Arrays.sort(stringArray);

    // Display the sorted arrays
    System.out.print("Sorted Integer objects: ");
    printList(intArray);
    System.out.print("Sorted Double objects: ");
    printList(doubleArray);
    System.out.print("Sorted Character objects: ");
    printList(charArray);
    System.out.print("Sorted String objects: ");
    printList(stringArray);
  }

  /** Print an array of objects */
  public static void printList(Object[] list) {
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
    System.out.println();
  }
}
