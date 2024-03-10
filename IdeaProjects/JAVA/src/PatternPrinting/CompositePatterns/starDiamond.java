package PatternPrinting.CompositePatterns;

import java.util.Scanner;

//         *
//       * * *
//     * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
public class starDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows:");
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int m = n-1;
        int nst1 = 2*m-1;
        int nsp1 = 1;

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            nst += 2;
            nsp--;
            System.out.println();
        }

        for (int i = 1; i<=m; i++){
            for(int j = 1; j<=nsp1; j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j<=nst1; j++){
                System.out.print("*"+" ");
            }
            nst1 -= 2;
            nsp1++;
            System.out.println();
        }



    }
}
