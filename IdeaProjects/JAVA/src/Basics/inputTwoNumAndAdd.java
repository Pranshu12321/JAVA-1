package Basics;

import java.util.Scanner;

public class inputTwoNumAndAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));

    }
}
