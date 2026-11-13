import java.util.ArrayList;
import java.util.HashSet;

public class leetcode448{
    public static void main(String[] args) {
        int nums[]={1,1,1};
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=nums.length;i++){
            if(set.contains(i)==false){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
