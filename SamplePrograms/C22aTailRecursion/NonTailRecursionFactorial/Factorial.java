public class Factorial {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: Factorial <Non-negative Integer>");
      System.exit(1);
    }

    int n = Integer.valueOf(args[0]);
    if (n < 0) {
      System.out.println("Usage: Factorial <Non-negative Integer>");
      System.exit(2);
    }
    System.out.println(n + "! = " + factorial(n));
  }

  public static int factorial(int n) {
    if (n == 0) {  // base case
      return 1;
    } else { // recursive call or method invocation
      // non-tail recursion, because we have to multiple factorial(n-1) by n, a pending operation
      return n * factorial(n - 1);
    }
  }
}
