public class Fibonacci {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: Fibonacci <Non-negative Integer>");
      System.exit(1);
    }

    int n = Integer.valueOf(args[0]);
    if (n < 0) {
      System.out.println("Usage: Fibonacci <Non-negative Integer>");
      System.exit(2);
    }
    System.out.println("Fib(" + n + ") = " + fibonacci(n));
  }

  public static int fibonacci(int n) {
    if (n == 0) {  // base case
      return 0;
    } else if (n == 1) {
      return 1;
    } else { // recursive call or method invocation
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}
