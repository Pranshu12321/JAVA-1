package PatternPrinting.specialPatterns;

import java.util.Scanner;

public class starTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of rows:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1 ; j<=n; j++){
                if(j+i>n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }


            }
            System.out.println();

        }
    }
}
