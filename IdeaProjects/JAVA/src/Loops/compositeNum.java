package Loops;

import java.util.Scanner;

public class compositeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int x = 0;
        for(int i=2;  i<n-1; i++){
            if (n%i == 0) {
                System.out.println("Composite number");
                x = 1;
                break;
            }

        }
        if (n == 1) System.out.println("Neither Composite nor Prime");
        else if (x == 0) System.out.println("Prime number");

    }
}
