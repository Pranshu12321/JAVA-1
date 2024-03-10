package Basics;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to be divided by 2");
        int x = sc.nextInt();
        double y = (double) x;
        System.out.println(y/2);

        System.out.println("Write a number");
        double a = sc.nextDouble();
        int b = (int)a;
        System.out.println(b);


    }
}
