import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of range: ");
        int end = sc.nextInt();

        int count = 0;

        System.out.println("Numbers divisible by both 7 and 9 in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0 && i % 9 == 0) {  // Changed condition
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal numbers divisible by both 7 and 9: " + count);

        sc.close();
    }
}
