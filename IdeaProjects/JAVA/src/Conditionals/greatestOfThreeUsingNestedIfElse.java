package Conditionals;

import java.util.Scanner;

public class greatestOfThreeUsingNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write 1st number: ");
        int a = sc.nextInt();
        System.out.print("Write 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Write 3rd number: ");
        int c = sc.nextInt();

        if(a>b) {
            if(a>c) System.out.println(a+" is the greatest");
            else System.out.println(c+" is the greatest");
        }
        else if(b>c) System.out.println(b+" is the greatest");
        else System.out.println(c+" is the greatest");
    }
}
