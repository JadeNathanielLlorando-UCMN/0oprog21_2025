import java.util.Scanner;

public class DebugFive2 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = input.nextInt();

        System.out.print("Enter another number: ");
        num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("One of these numbers is evenly divisible into the other.");
        } else {
            System.out.println("Neither of these numbers is evenly divisible into the other.");
        }

        input.close();
    }
}
