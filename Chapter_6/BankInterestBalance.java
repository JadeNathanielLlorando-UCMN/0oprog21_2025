import java.util.Scanner;

public class BankInterestBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double newBalance = balance;

            System.out.println();
            System.out.printf("With an initial balance of %.2f at an interest rate of %.2f%n", balance, rate);

            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * rate);
                System.out.printf("After year %d balance is %.4f%n", year, newBalance);
            }
        }

        System.out.println("\nProgram finished successfully.");
    }
}
