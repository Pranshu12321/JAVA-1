package Conditionals;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of 1st side:");
        int a = sc.nextInt();
        System.out.print("Enter dimension of 2nd side:");
        int b = sc.nextInt();
        System.out.print("Enter dimension of 3rd side:");
        int c = sc.nextInt();

        if(a<b+c && b<a+c && c<a+b) System.out.println("Triangle is valid");
        else System.out.println("Triangle is invalid");
    }
}
