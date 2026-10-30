
import java.util.Arrays;
import java.util.HashMap;

public class leetcode506{
    public static void main(String[] args) {
        int arr[]={10,3,8,9,4};
        int arr1[]=arr.clone();
        String[] arr2= new String[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Arrays.sort(arr1);

        for(int i=0;i<arr.length;i++){
            map.put(arr1[arr.length-1-i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                arr2[i]="Gold Medal";
            }else if(map.get(arr[i])==2){
                arr2[i]="Silver Medal";
            }else if(map.get(arr[i])==3){
                arr2[i]="Bronze Medal";
            }else{
                arr2[i]=""+map.get(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
