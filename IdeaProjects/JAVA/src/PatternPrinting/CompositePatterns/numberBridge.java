package PatternPrinting.CompositePatterns;

import java.util.Scanner;

//           1 2 3 4 5 6 7
//           1 2 3   5 6 7
//           1 2       6 7
//           1           7
public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows:");
        int n = sc.nextInt();
        int m = n-1;
        for(int k = 1; k<=2*n-1; k++) {
            System.out.print(k+" ");
        }
        System.out.println();


        for(int i = 1; i<=m; i++) {
            int a = 1;
            for(int j = 1; j<=m-i+1; j++){
                System.out.print(a++ +" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print(" "+" ");
                a++;
            }
            for(int j = 1; j<=m-i+1; j++){
                System.out.print(a++ +" ");
            }
            System.out.println();

        }
    }
}
