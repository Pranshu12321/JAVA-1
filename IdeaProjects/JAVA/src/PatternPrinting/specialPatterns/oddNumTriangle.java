package PatternPrinting.specialPatterns;

import java.util.Scanner;

public class oddNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows = ");
        int m = sc.nextInt();
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }

    }
}
