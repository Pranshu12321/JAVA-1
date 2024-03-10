package PatternPrinting.specialPatterns;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows = ");
        int m = sc.nextInt();
        int mid= m/2+1;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m; j++){
                if (i==j || i==m-j+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
