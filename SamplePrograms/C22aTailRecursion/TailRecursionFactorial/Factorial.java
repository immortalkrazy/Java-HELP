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
    return factorial(n, 1);
  }

  private static int factorial(int n, int result) {
    if (n == 0) { // base case
      return result;
    } else { // recursive call
      // tail recursion, no pending operation after returning from the recursive call
      return factorial(n - 1, n * result);
    }
  }
}
