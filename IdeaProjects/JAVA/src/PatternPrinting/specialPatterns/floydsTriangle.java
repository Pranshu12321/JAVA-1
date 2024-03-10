package PatternPrinting.specialPatterns;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows = ");
        int n = sc.nextInt();
        int x = 1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

}
