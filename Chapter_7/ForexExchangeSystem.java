import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};

        double[][] rates = new double[5][5];

        System.out.println("=== FOREX EXCHANGE SYSTEM ===");
        System.out.println("Enter exchange rates against the Philippine Peso");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\nEnter rates for " + currencies[i] + " (Day 1 to Day 5):");
            for (int d = 0; d < 5; d++) {
                System.out.print("Day " + (d + 1) + ": ");
                rates[i][d] = sc.nextDouble();
            }
        }

        System.out.println("\n\n=== DISPLAYING RECORDED FOREX RATES ===");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\n----------------------------------------------");
            System.out.println("Currency: " + currencies[i]);
            System.out.println("----------------------------------------------");

            System.out.print("Rates: ");
            for (int d = 0; d < 5; d++) {
                System.out.print(rates[i][d] + "  ");
            }
            System.out.println();

            double peak = rates[i][0];
            double low = rates[i][0];

            for (int d = 1; d < 5; d++) {
                if (rates[i][d] > peak) peak = rates[i][d];
                if (rates[i][d] < low) low = rates[i][d];
            }

            System.out.println("Peak Rate: " + peak);
            System.out.println("Lowest Rate: " + low);

            System.out.println("\nDaily Changes:");
            for (int d = 1; d < 5; d++) {
                System.out.print("Day " + d + " to Day " + (d + 1) + ": ");

                if (rates[i][d] > rates[i][d - 1]) {
                    System.out.println("Increase");
                } else if (rates[i][d] < rates[i][d - 1]) {
                    System.out.println("Decrease");
                } else {
                    System.out.println("No Change");
                }
            }
        }

        sc.close();
        System.out.println("\n=== END OF REPORT ===");
    }
}
