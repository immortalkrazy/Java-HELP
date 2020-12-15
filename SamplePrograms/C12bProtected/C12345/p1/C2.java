package p1;

public class C2 {
  C1 o = new C1();

  public void doSth() {
    System.out.println("C2: o.x = " + o.x);
    System.out.println("C2: o.y = " + o.y);
    System.out.println("C2: o.z = " + o.z);

    // Compilation error if
    // System.out.println("o.u = " + o.u);
    System.out.println("C2: can we print out o.u?");
    
    o.m("C2");
  }
}
