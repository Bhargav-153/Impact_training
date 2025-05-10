import java.util.Scanner;

public class divisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter another number m: ");
        int num2 = sc.nextInt();

        int before = (num1/num2) * num2;
        int after = ((num1+ num2 -1) / num2) * num2;

        int distBefore = num1 - before;
        int distAfter = after - num1;

        int nearest;
        if(distBefore < distAfter){
            nearest = before;
        }else if (distAfter < distBefore){
            nearest = after;
        }else{
            nearest = before;
        }

        System.out.println("nearest number divisible by " + nearest);
     
    }
    
}
