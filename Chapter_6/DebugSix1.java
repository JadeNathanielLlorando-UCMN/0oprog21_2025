import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

        while (day <= days) {
            System.out.printf("After day %d, you have ₱%.2f%n", day, money);
            money = 2 * money;
            ++day;
        }
    }
}
