package Basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println((int)ch);
        //ASCII value of A=65, a=97, 0=48

    }
}
