package Basics;

import java.util.Scanner;

public class inputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Square of "+n+" is "+n*n);
    }
}
