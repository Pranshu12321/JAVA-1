package PatternPrinting.CompositePatterns;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //METHOD 1
//            for( int j = 1; j <= n-i; j++) {
//                System.out.print(" "+" ");
//            }
//            for (int j = 1; j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            for( int j = 1; j <= n-i; j++) {
//                System.out.print("*"+" ");
//            }
            //METHOD 2
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for (int j=1; j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
//         ******
//        ******
//       ******
//      ******
//     ******