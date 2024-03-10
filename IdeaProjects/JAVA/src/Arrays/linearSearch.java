package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Element : ");
        int x = sc.nextInt();
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //               SOLUTION
        boolean flag = false; //false means not found
        for (int i = 0; i < n; i++){
            if(arr[i] == x) {
//                System.out.println("Element Found");
                flag = true; // true means found
                break;
            }
        }
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Element not found");
    }

}

