import java.util.HashMap;

public class recurssion {
    public static void main(String[] args) {
        int arr[]={4, 5, 1, 2, 1, 4, 5};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])) {
             map.put(arr[i], map.get(arr[i]) + 1);
             System.out.println(arr[i]);
             break;
            } else {
                 map.put(arr[i], 1);
                }
             }
    
    
}}
