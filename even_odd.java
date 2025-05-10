import java.util.Scanner;

public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single digit number ");
        int num = sc.nextInt();
        num = Math.abs(num);
        if(num <0 || num > 9){
            System.out.println("invalid input");
        }else{
            if(num % 2 == 0){
                System.out.println("even num");
            }else{
                System.out.println("odd num");
            }
        }
    }
    
}
