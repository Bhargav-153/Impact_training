import java.util.Scanner;

public class hotel_terrif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Section
        System.out.print("Enter the month of stay: ");
        String month = sc.nextLine().toLowerCase();

        System.out.print("Enter the room rent per day: ");
        double rentPerDay = sc.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int days = sc.nextInt();

        // Check if it's a peak season
        boolean isPeakSeason = month.equals("april") || month.equals("may") || month.equals("june")
                             || month.equals("november") || month.equals("december");

        if (isPeakSeason) {
            rentPerDay *= 1.20; // Increase rent by 20%
        }

        // Calculate total tariff
        double totalTariff = rentPerDay * days;

        // Output result
        System.out.printf("Hotel Tariff: ₹%.2f%n", totalTariff);
        
        sc.close();
    }
}
