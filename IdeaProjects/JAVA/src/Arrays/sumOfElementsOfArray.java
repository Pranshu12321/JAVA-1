package Arrays;

public class sumOfElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {45, 34, 65, 44, 32, 32};
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
