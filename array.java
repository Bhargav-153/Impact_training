import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the numbers separated by space:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("You entered: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result = nums[0];
        for (int i = 1; i < size; i++) {
            result -= nums[i];
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

