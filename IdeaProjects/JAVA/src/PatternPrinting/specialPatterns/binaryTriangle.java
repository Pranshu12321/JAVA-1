package PatternPrinting.specialPatterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows = ");
        int m = sc.nextInt();
        for (int i=1; i<=m; i++) {
            for (int j = 1; j<=i; j++) {


                //METHOD 1
//                if (i%2 == 1) {
//                    if (j%2 == 1) {
//                        System.out.print(1+" ");
//                    }
//                    else {
//                        System.out.print(0+" ");
//                    }
//
//                }
//                else{
//                    if (j%2 == 1) {
//                        System.out.print(0+" ");
//                    }
//                    else{
//                        System.out.print(1+" ");
//                    }
//
//                }


                //METHOD 2
//                if(i%2==0 && j%2==0 || i%2==1 && j%2==1) {
//                    System.out.print(1+" ");
//                }
//                else{
//                    System.out.print(0+" ");
//                }

                //METHOD 3
                if((i+j)%2 == 0) {
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }
    }
}
