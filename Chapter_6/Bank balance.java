import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03;
        int year = 1;
        int choice = 1;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        while (choice == 1) {
            balance = balance + (balance * INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, INTEREST_RATE, balance);

            System.out.println();
            System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            year++;
        }

        System.out.println("---- Operation complete. ----");
        input.close();
    }
}
