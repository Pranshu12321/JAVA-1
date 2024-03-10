package PatternPrinting.CompositePatterns;

import java.util.Scanner;

//           * * * * * * *
//           * * *   * * *
//           * *       * *
//           *           *
public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows:");
        int n = sc.nextInt();
        int m = n-1;
        for(int k = 1; k<=2*n-1; k++) {
            System.out.print("*"+" ");
        }
        System.out.println();

        for(int i = 1; i<=m; i++) {
            for(int j = 1; j<=m-i+1; j++){
                System.out.print("*"+" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j<=m-i+1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
