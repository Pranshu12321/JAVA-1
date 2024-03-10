package Arrays;

import java.util.Scanner;

public class inputOutputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values of array");

        //input--> loop
        for (int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }

        //output--> loop
        for(int i=0; i<=n-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //initialisation of array
        int[] array = {56, 76, 44544, 64, -0, -222222, 956, 454, 4, 323, 54423, 6 , 4, 434};
        int m = array.length;
        for (int i = 0; i<m; i++){
            System.out.print(array[i]+" ");
        }

    }
}
