import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class does nothing useful but to demonstrate array and ArrayList
 * conversion
 */
public class ArrayArrayList  {
  public static void main(String[] args) {
    arrayToArrayList();
    arrayListToArray();
    iterateArrayListUsingForLoop();
    iterateArrayListUsingEnhancedForLoop();
    iterateArrayListUsingForEachMethod();
  }

  public static void arrayToArrayList() {
    String[] colors = {"red", "green", "blue"};
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(colors));
  }

  public static void arrayListToArray() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("red");
    list.add("green");
    list.add("blue");
    String[] colors = new String[list.size()];
    list.toArray(colors);
  }

  public static void iterateArrayListUsingForLoop() {
    ArrayList<StringBuilder> list = new ArrayList<StringBuilder>(Arrays.asList(new StringBuilder[]{new StringBuilder("red"),
      new StringBuilder("green"), new StringBuilder("blue"), new StringBuilder("pink")}));

    System.out.println("Use the for loop to print out each element");
    for (int i = 0; i < list.size(); i ++) {
      System.out.println(list.get(i));
    }

    System.out.println("Use the for loop and do an assignment");
    for (int i = 0; i < list.size(); i ++) {
      StringBuilder sb = list.get(i);
      sb.reverse();
    }

    System.out.println("Use the for loop to print out each element again after the assignments");
    for (int i = 0; i < list.size(); i ++) {
      System.out.println(list.get(i));
    }
  }

  public static void iterateArrayListUsingEnhancedForLoop() {
    ArrayList<StringBuilder> list = new ArrayList<StringBuilder>(Arrays.asList(new StringBuilder[]{new StringBuilder("red"),
      new StringBuilder("green"), new StringBuilder("blue"), new StringBuilder("pink")}));

    System.out.println("Use the enhanced for loop to print out each element");
    for (StringBuilder sb: list) {
      System.out.println(sb);
    }
  }

  public static void iterateArrayListUsingForEachMethod() {
    ArrayList<StringBuilder> list = new ArrayList<StringBuilder>(Arrays.asList(new StringBuilder[]{new StringBuilder("red"),
      new StringBuilder("green"), new StringBuilder("blue"), new StringBuilder("pink")}));

    System.out.println("Use the ArrayList's forEach method to print out each element (just an example, to show its existence, to be discussed in the future)");
    list.forEach(sb -> System.out.println(sb));
  }
}
