package Arrays;

public class doubletInArraySumEqualsToX {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-3,8,-5,10};
        int x = 5;
        for (int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i]+ arr[j] == x) {
                    System.out.println(arr[i]+"+"+arr[j]+"="+x);
                }
            }

        }
    }
}
