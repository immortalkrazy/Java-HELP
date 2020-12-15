public class NullPointExceptionDemo1 {
  private Circle circle;

  public static void main(String[] args) {
    NullPointExceptionDemo1 demo = new NullPointExceptionDemo1();
    demo.doSth();
  }

  public void doSth() {
    System.out.println(circle.toString());
  }

}
