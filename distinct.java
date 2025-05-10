import java.util.*;

public class distinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements (space-separated): ");
        String[] input = scanner.nextLine().split(" ");
        Set<Integer> uniqueSet = new HashSet<>();

        for (String s : input) {
            uniqueSet.add(Integer.parseInt(s));
        }

        // Convert Set to List
        List<Integer> d = new ArrayList<>(uniqueSet);
        int n = d.size();

        // Bubble Sort
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (d.get(j) > d.get(j + 1)) {
                    // Swap
                    int temp = d.get(j);
                    d.set(j, d.get(j + 1));
                    d.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted unique elements: " + d);
        System.out.println("Count: " + n);

        scanner.close();
    }
}
