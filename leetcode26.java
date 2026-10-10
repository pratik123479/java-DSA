import java.util.Arrays;
import java.util.HashSet;

public class leetcode26 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        HashSet<Integer> set=new HashSet<>();

        for(int k=0;k<arr.length;k++){
            set.add(arr[k]);
        }
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
                
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j+1);
    }
}
