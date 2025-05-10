
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Convert to positive using Math.abs()
        num = Math.abs(num);

        // Get last digit
        int lastDigit = num % 10;

        // Get first digit
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);

        scanner.close();
    }
}
