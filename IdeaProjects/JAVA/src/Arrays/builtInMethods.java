package Arrays;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {43,34,3,23,24,56,73,37};
        //for each loop
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
