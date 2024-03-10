package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
//        int arr[] = new int[10];
        ArrayList<Integer> arr = new ArrayList<>(6);
        //arr[0] = 5; ERROR We can't store values in arraylist like this
        arr.add(0, 10); //arr[0] = 10
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println(arr.get(0)); //arr[0]


        //printing arraylist
        System.out.println(arr);
//        for (int i = 0; i<arr.size(); i++){
//            System.out.print(arr.get(i)+" ");
//        }
        // in array 0 is value of any index by default
        //but if we do not store any value in arraylist it will show error while printing

        //       Changing value of an index in arraylist
        arr.set(4, 400); //modify
        System.out.println(arr);

        //we can add elements in arraylist
        arr.add(3, 35); //add at a particular index
        arr.add(100); //add at the end
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(arr.size());
    }

}
