package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the cost price?:");
        int cp = sc.nextInt();
        System.out.print("What is the selling price?:");
        int sp = sc.nextInt();
        if(sp > cp) {
            int p = sp - cp;
            System.out.println("Seller has made profit of Rs"+p);
        }
        else if(cp > sp) {
            int l = cp - sp;
            System.out.println("Seller has incurred loss of Rs"+l);
        }
        else {
            System.out.println("Seller has neither made profit nor incurred loss");
        }

    }
}
