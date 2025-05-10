import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to search for: ");
        int x = sc.nextInt();

        int count = 0;
       
        while (num > 0) {
            int digit = num % 10;
            if (digit == x) {
                count++;
            }
            num /= 10;
        }

        System.out.println("The digit " + x + " appears " + count + " times in the number " + num + ".");

        sc.close();
       
    }
}
