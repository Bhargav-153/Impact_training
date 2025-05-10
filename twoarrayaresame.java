import java.util.*;

public class twoarrayaresame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read nums1
        System.out.print("Enter the numbers for nums1: ");
        String[] input1 = scanner.nextLine().split(" ");
        int[] nums1 = new int[input1.length];
        for (int i = 0; i < input1.length; i++) {
            nums1[i] = Integer.parseInt(input1[i]);
        }

        // Read nums2
        System.out.print("Enter the numbers for nums2: ");
        String[] input2 = scanner.nextLine().split(" ");
        int[] nums2 = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            nums2[i] = Integer.parseInt(input2[i]);
        }

        // Sum nums1
        int result = 0;
        for (int num : nums1) {
            result += num;
        }

        // Sum nums2
        int res = 0;
        for (int num : nums2) {
            res += num;
        }

        // Print results
        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("Sum of nums1: " + result);
        System.out.println("nums2: " + Arrays.toString(nums2));
        System.out.println("Sum of nums2: " + res);

        // Compare
        if (result == res && nums1.length == nums2.length) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        scanner.close();
    }
}
