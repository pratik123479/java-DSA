import java.util.HashSet;

public class leetcode219 {
    public static void main(String[] args) {
        int nums[]={1, 1, 3, 1};
        int k=2;
        boolean val=false;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if (i > k) {
            set.remove(nums[i - k - 1]);
        }

        if (set.contains(nums[i])) {
            val = true;
            break;
        }

        set.add(nums[i]);
    }

    System.out.println(val);
        
    }
}
