package Arrays;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int z = 0;
        for (int i = 0; i<n; i++){
            max = Math.max(arr[i], max);
            if(arr[i] == max) z = i;
        }
        int smax = Integer.MIN_VALUE; //smax = second maximum value
        for (int i = 0; i<n; i++){
            if (i != z) {
                smax = Math.max(arr[i], smax);
            }
        }
        System.out.println("Maximum value is: "+max);
        System.out.println("Second Maximum value is: "+smax);

    }
}