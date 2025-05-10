import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
        String binary = Integer.toBinaryString(n);
        int b = Integer.parseInt(binary);

        System.out.println("Type: " + ((Object)b).getClass().getSimpleName());
        System.out.println("Binary without prefix as int: " + b);

        scanner.close();
    }
}
