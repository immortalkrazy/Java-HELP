import p1.C1;
import p1.C2;
import p1.C3;
import p2.C4;
import p2.C5;

public class Client {
  public static void main(String[] args) {
    C1 c1 =  new C1();
    C2 c2 = new C2();
    c2.doSth();

    C3 c3 = new C3();
    c3.doSth();

    C4 c4 = new C4();
    c4.doSth();

    C5 c5 = new C5();
    c5.doSth();
  }
}
