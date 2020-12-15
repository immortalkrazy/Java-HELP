public class PrintMsg {
  public static void main(String[] args) {
    nPrintMsg("Hello, World!", 5);
  }

  public static void nPrintMsg(String msg, int n) {
    // base case
    if (n == 0) return;

    // subproblem 1
    System.out.println(msg);

    // subproblem 2
    nPrintMsg(msg, n-1);
  }
}
