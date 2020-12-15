import java.util.Scanner;

public class TestLoan {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter annual percentage rate of the interest, e.g., 8.25: ");
      double apr = sc.nextDouble();

      System.out.println("Enter the term of the loan (the number of years as an integer): ");
      int term = sc.nextInt();

      System.out.println("Enter the principal of the loan (the amount of borrowed): ");
      double principal = sc.nextDouble();

      Loan loan = new Loan(apr, term, principal);

      System.out.printf("This loan was created on %s\n" +
        "The monthly payment is %.2f\n" +
        "The total payment is %.2f\n",
        loan.getLoanDate().toString(),
        loan.getMonthlyPayment(),
        loan.getTotalPayment()
      );
  }
}
