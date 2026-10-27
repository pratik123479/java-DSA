import java.util.Arrays;

public class leetcode1470 {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,7};
        int n=3;
        int arr2[]=new int[arr.length];

        for (int i = 0; i < n; i++) {
             arr2[2 * i] = arr[i];
             arr2[2 * i + 1] = arr[i + n];
}
        System.out.println(Arrays.toString(arr2));
    }
}
