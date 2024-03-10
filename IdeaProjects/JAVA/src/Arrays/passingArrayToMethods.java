package Arrays;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {23, 54, 65, 32, 39, 35};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    //  IN ARRAY CHANGE WILL OCCUR UNLIKE INTEGER
    // IN JAVA REFERENCE VARIABLE GETS PASSED


    private static void change(int[] arr) {
        arr[0] = 55;
    }


}
