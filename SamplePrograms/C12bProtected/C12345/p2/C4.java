package p2;

import p1.C1;

public class C4 extends C1 {
  public void doSth() {
    System.out.println("C4: o.x = " + x);
    System.out.println("C4: o.y = " + y);
    // Compilation error if
    //   System.out.println("o.z = " + z);

    // Compilation error if
    // System.out.println("o.u = " + o.u);
    m("C4");
  }
}
