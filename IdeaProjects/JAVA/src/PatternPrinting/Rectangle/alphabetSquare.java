package PatternPrinting.Rectangle;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("No. of rows = ");
        int m = sc.nextInt();
        System.out.println("No. of columns = ");
        int n = sc.nextInt();
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }

    }
}