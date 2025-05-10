import java.util.Scanner;

public class KaprekarNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int square_n = n * n;
        int q = String.valueOf(n).length();

        String squareStr = String.valueOf(square_n);

        // Pad with leading zeros if needed to ensure length >= q
        while (squareStr.length() < q) {
            squareStr = "0" + squareStr;
        }

        String part1 = squareStr.substring(squareStr.length() - q);
        String part2 = squareStr.substring(0, squareStr.length() - q);

        int p1 = Integer.parseInt(part1);
        int p2 = part2.isEmpty() ? 0 : Integer.parseInt(part2);

        int p = p1 + p2;

        System.out.println("Sum of parts: " + p);

        // Optional: Check if it's a Kaprekar number
        if (p == n) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is NOT a Kaprekar number.");
        }

        scanner.close();
    }
}
