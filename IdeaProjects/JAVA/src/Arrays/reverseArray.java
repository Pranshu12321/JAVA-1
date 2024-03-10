package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
//             Method 1
//        for (int i = 0; i<n/2; i++){
////            int j = n-1-i;    // i+j = 0+n-1 sum of index of 1st and last term
//            int temp = arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
        //           Method 2 using while loop
        int i = 0, j = n-1;
//        int i = 3, j =5; //for swapping a part of array
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;

        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
