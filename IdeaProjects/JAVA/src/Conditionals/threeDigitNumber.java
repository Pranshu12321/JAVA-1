package Conditionals;

import java.util.Scanner;

public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any number:");
        int n = sc.nextInt();

        if(n>99 && n<999) System.out.println(n+" is a three digit number");
        else System.out.println(n+" is not a three digit number");
    }

}
