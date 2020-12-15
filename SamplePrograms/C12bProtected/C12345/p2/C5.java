package p2;

import p1.C1;
public class C5 {
  C1 o = new C1();

  public void doSth() {
    System.out.println("C5: o.x = " + o.x);
    // Compilation error if
    // System.out.println("o.y = " + o.y);
    // System.out.println("o.z = " + o.z);

    // Compilation error if
    // System.out.println("o.u = " + o.u);
    // o.m();
  }
}
