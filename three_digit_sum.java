import java.util.Scanner;

public class three_digit_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = scanner.nextInt();

        num = Math.abs(num);

      
        if (num < 100 || num > 999) {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        } else {
            int digit1 = num / 100;            
            int digit2 = (num / 10) % 10;      
            int digit3 = num % 10;             

            int sum = digit1 + digit2 + digit3;

            System.out.println("Sum of digits: " + sum);
        }

        scanner.close();
    }
}
