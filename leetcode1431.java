import java.util.Arrays;

public class leetcode1431 {
    public static void main(String[] args) {
        int arr[]={4,2,1,1,2};
        int extracandy=1;
        int max=0;
        boolean arr2[]=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+extracandy>=max){
                arr2[i]=true;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
