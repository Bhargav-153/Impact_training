import java.util.Scanner;

public class planatation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int total = rows * cols;

        System.out.print("Enter the position number (1 to " + total + "): ");
        int num = sc.nextInt();

        // Check if input is within valid range
        if (num < 1 || num > total) {
            System.out.println("Invalid number. Please enter a number between 1 and " + total + ".");
        } else {
            // Convert number to row and column (0-indexed)
            int row = (num - 1) / cols;
            int col = (num - 1) % cols;

            // Check if it's a supporter
            if (row == 0 || col == 0 || col == cols - 1) {
                System.out.println("supporter");
            } else {
                System.out.println("mango");
            }
        }

        sc.close();
    }
}
