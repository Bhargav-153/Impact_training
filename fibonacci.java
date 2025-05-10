import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        if(num < 0){
            System.out.println("Invalid input. Please enter a non-negative number.");
        }else{
            int a = 0, b = 1, c;
            System.out.print("Fibonacci series: " + a + " " + b + " ");
            for(int i=2; i<num; i++){
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
    
}
