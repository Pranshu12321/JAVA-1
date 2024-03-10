package Conditionals;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        int n = sc.nextByte();

        //condition ? if true : if false
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
