package Loops;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write n: ");
        int n = sc.nextInt();
//        1 3 5 7 9.....
//        nth term= a+(n-1)d
//        for n=2 nth term= 2n-1
        for(int i=1;i<2*n-1;i+=2)
        {
            System.out.println(i);
        }

    }
}
