package PatternPrinting.Triangle;

import java.util.Scanner;

public class starTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows = ");
        int m = sc.nextInt();
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
