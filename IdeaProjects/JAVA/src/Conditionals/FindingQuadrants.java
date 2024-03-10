package Conditionals;

import java.util.Scanner;

public class FindingQuadrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write x coordinate: ");
        int x = sc.nextInt();
        System.out.println("Write y coordinate: ");
        int y = sc.nextInt();

        if(x == 0){
            if(y == 0) System.out.println("Given point is origin");
            else System.out.println("Given point is on y-axis");
        }
        else if(y == 0){
            if(x == 0) System.out.println("Given point is origin");
            else System.out.println("Given point is on x-axis");
        }
        else if(x < 0){
            if(y > 0) System.out.println("Given point lies in 2nd quadrant");
            else System.out.println("Given point lies in 3rd quadrant");
        }
        else if(y < 0){
            if(x > 0) System.out.println("Given point lies in 4th quadrant");
            else System.out.println("Given point lies in 3rd quadrant");
        }
        else System.out.println("Given point lies in 1st quadrant");


    }
}
