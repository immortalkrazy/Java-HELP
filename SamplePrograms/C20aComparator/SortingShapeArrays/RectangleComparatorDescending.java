import java.util.Comparator;

class RectangleComparatorDescending implements Comparator<Rectangle> {
  public int compare(Rectangle lhs, Rectangle rhs) {
    if (lhs.getArea() > rhs.getArea()) {
      return -1;
    } else if (lhs.getArea() < rhs.getArea()) {
      return 1;
    } else {
      return 0;
    }
  }

  // Or if you know more about Java API ...
  // public int compare(Rectangle lhs, Rectangle rhs) {
  //   return -Double.compare(lhs.getArea(), rhs.getArea());
  // }
}


// Second implemetation strategy:
// class RectangleComparatorDescending extends RectangleComparator {
//   public int compare(Rectangle lhs, Rectangle rhs) {
//     return -super.compare(lhs, rhs);
//   }
// }
