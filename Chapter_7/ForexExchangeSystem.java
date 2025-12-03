import java.util.Scanner;

public class ForexExchangeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        String[] days = {"Nov 1", "Nov 2", "Nov 3", "Nov 4", "Nov 5"};
        
        double[][] rates = new double[5][5];

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);
            
            for (int j = 0; j < days.length; j++) {
                System.out.print("Rate on " + days[j] + ": ");
                rates[i][j] = scanner.nextDouble();
            }
            System.out.println(); 
        }

        System.out.println("================= FOREX SUMMARY (Nov 1 - Nov 5) ==================");
        System.out.printf("%-10s | %-7s %-7s %-7s %-7s %-7s %-7s %-7s%n", 
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double lowest = rates[i][0];

            System.out.printf("%-10s | ", currencies[i]);

            for (int j = 0; j < days.length; j++) {
                System.out.printf("%-7.2f ", rates[i][j]);

                if (rates[i][j] > peak) {
                    peak = rates[i][j];
                }
                if (rates[i][j] < lowest) {
                    lowest = rates[i][j];
                }
            }
            System.out.printf("%-7.2f %-7.2f%n", peak, lowest);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println();

        System.out.println("=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("(+ increase / - decrease / no change for same value)");
        System.out.println();

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);

            for (int j = 1; j < days.length; j++) {
                double diff = rates[i][j] - rates[i][j-1];
                
                System.out.print(days[j-1] + " -> " + days[j] + ": ");

                if (diff > 0) {
                    System.out.printf("+ %.2f%n", diff);
                } else if (diff < 0) {
                    System.out.printf("- %.2f%n", Math.abs(diff));
                } else {
                    System.out.println("No Change");
                }
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
