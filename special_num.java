import java.util.*;

public class special_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        if(num > 99 || num < 0){
            System.out.println("Invalid input");
        }else{
            int digit1 = num / 10;
            int digit2 = num % 10;
            int sum = digit1 + digit2;
            int mul = digit1 * digit2;

            int total = sum + mul;
            if(total == num){
                System.out.print("magic num");
            }else{
                System.out.println("not magic");
            }

        }
    }
    
}
