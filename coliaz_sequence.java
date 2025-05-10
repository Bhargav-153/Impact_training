import java.util.*;
public class coliaz_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num);

        if(num < 0){
            System.out.println("invalid");
        }else{
            int count = 0;
            while(num !=1){
                count ++;
                System.out.print(num + " ");
                if(num % 2 == 0){
                    num = num /2;
                }else{
                    num = 3 * num + 1;
                }
            }
            System.out.println("1");
            count++;

            System.out.println("total count " +  count);
        }
}
}
