import java.util.Scanner;
public class DigitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while(num !=0){
            int digit = num % 10; 
            System.out.print(digit + " ");
            num = num / 10; 
        }
    }  
}
