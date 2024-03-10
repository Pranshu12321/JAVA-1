package Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        int n = arr.length;
        int[] brr = new int[10];
        int k = 1;
        for (int i=n-k; i<n; i++){
            brr[i-k] = arr[i];
        }
        for (int i = 0; i<n-k; i++){
            brr[i+k] = arr[i];
        }
        System.out.println();
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
