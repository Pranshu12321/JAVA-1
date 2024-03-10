package Arrays;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.concurrent.LinkedTransferQueue;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {43,34,75,27,24,96,58,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr;
        //**SHALLOW COPY** now arr has two names arr and nums
        //new copied array of arr is not formed
        // if we change in nums then arr will also change
        nums[0] = 55;
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println("\n"+arr[0]); // it will also print nums[0]


        //                  DEEP COPY
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[1] = 1000;
        System.out.println(arr[1]);

        //             DEEP COPY USING LOOP
        int[] crr = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            crr[i] = arr[i];
        }
    }

}
