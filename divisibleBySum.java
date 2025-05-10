import java.util.Scanner;
public class divisibleBySum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num; 

        while(num != 0){
            int digit = num % 10; 
            sum += digit; 
            num = num / 10; 
        }
        System.out.println("sum of digits: " + sum);

        if(temp % sum == 0){
            System.out.println("harshad number ");
        } else {
            System.out.println("not a harshad number ");
        }
        
    }
    
}
