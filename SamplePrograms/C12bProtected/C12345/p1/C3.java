package p1;

public class C3 extends C1 {
    public void doSth() {
      System.out.println("C3: o.x = " + x);
      System.out.println("C3: o.y = " + y);
      System.out.println("C3: o.z = " + z);

      // Compilation error if
      // System.out.println("o.u = " + o.u);
      System.out.println("C3: can we print out o.u?");

      m("C3");
    }
}
