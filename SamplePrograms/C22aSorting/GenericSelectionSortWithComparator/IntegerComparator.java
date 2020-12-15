import java.util.Comparator;

public class IntegerComparator implements Comparator<Object> {
  public int compare(Object lhs, Object rhs) {
    return Integer.compare((Integer)lhs, (Integer)rhs);
  }
}
