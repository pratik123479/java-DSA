import java.util.Arrays;
public class leetcode977 {
    public static void main(String[] args) {
        int arr[]={-10000, -9999, -1, 0, 0, 3, 9999};
        int arr2[]=new int[arr.length];
        
        int i=0;
        int j=arr.length-1;
        int k=arr2.length-1;
        System.out.println(Arrays.toString(arr));
        while(k>=0){
            int first=arr[i]*arr[i];
            int last=arr[j]*arr[j];

            if(first>last){
                arr2[k]=first;
                i++;
            }else{
                arr2[k]=last;
                j--;
            }
            
             k--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
