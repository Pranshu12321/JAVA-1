package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number:");
        int x = sc.nextInt();
        if(x<0) System.out.println(-x);
        else System.out.println(x);

    }
}
