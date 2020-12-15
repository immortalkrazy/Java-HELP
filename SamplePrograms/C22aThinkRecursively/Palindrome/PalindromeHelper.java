public class PalindromeHelper {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: Palindrome <a string>");
      System.exit(1);
    }

    System.out.println("String \"" + args[0] + "\" " +
      (isPalindrome(args[0])?"is":"is not") + " a palindrome" );
  }


  public static boolean isPalindrome(String s) {
      return isPalindrome(s, 0, s.length()-1);
  }

  // The recursive helper method
  private static boolean isPalindrome(String s, int beginIndex, int endIndex) {
    if (endIndex - beginIndex <= 1) return true;    // base case

    if (s.charAt(beginIndex) != s.charAt(endIndex)) return false; // subproblem 1

    return isPalindrome(s, beginIndex+1, endIndex-1); // subproblem 2
  }

}
