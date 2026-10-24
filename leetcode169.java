import java.util.HashMap;

public class leetcode169 {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        HashMap<Integer, Integer> set=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
        }
        
       for (int key : set.keySet()) {
            if (set.get(key) > arr.length / 2) {
             System.out.println(key);
             break;
    }
}
    }
}
