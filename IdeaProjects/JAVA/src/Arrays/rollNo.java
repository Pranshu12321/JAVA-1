package Arrays;
// print index(roll no.) of that student for which marks < 35

public class rollNo {
    public static void main(String[] args) {
        int[] arr = {54, 32, 76, 31, 35, 55, 24, 11, 78};
        int n = arr.length;
        for (int i = 0; i<n; i++){
            if (arr[i] < 35) {
                System.out.println(i+" ");
            }
        }

    }
}
