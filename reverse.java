import java.util.Scanner;


public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        if (num < 100 || num > 999) {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        } else {
            int digit1 = num /100; 
            int digit2 = (num / 10) % 10;
            int digit3  = num % 10;
            int reverse = digit3 * 100 + digit2 * 10 + digit1;
            System.out.println("Reversed number: " + reverse);
        }
    }

    
}

