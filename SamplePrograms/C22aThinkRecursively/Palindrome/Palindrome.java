public class Palindrome {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: Palindrome <a string>");
      System.exit(1);
    }

    System.out.println("String \"" + args[0] + "\" " +
      (isPalindrome(args[0])?"is":"is not") + " a palindrome" );
  }

  public static boolean isPalindrome(String s) {
    // base case
    if (s.length() <= 1) return true;

    // subproblem 1
    if (s.charAt(0) != s.charAt(s.length()-1)) return false;

    // subproblem 2
    return isPalindrome(s.substring(1, s.length()-1));
  }
}
