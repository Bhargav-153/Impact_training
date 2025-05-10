// public class patterns {
//     public static void main(String[] args) {
//         int n = 1;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(n + " ");
//                 n++;
//             }
//             System.out.println();
//         }
//     }
// }




public class patterns {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
