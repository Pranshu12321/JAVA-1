package Conditionals;

import java.util.Scanner;

public class leastOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write 1st number: ");
        int a = sc.nextInt();
        System.out.print("Write 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Write 3rd number: ");
        int c = sc.nextInt();

        if(a<b && a<c) System.out.println(a+" is the least");
        else if(a<b && c<a) System.out.println(c+" is the least");
        else System.out.println(b+" is the least");




    }
}
