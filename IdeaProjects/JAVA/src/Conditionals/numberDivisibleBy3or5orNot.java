package Conditionals;

import java.util.Scanner;

public class numberDivisibleBy3or5orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any number:");
        int x = sc.nextInt();

        if(x%3 == 0 || x%5 == 0) System.out.println("Given number is divisible by 3 or 5");
        else System.out.println("Given number is not divisible by 3 or 5");
    }
}
