package Arrays;

import java.util.Scanner;

public class maxValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        // SOLUTION 1
//        int max = arr[0];
//        for (int i = 1; i<n; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);


        // SOLUTION 2
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
//            if(arr[i] > max)  max = arr[i];
            max = Math.max(arr[i], max);
        }
        System.out.println(max);


    }
}
