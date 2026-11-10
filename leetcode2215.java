import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class l{
    public static void main(String[] args) {
      int nums1[] = {1,2,3,3}, nums2[] = {1,1,2,2};
      HashSet<Integer> set = new HashSet<>();
      HashSet<Integer> set2 = new HashSet<>();
      List<Integer> list1 = new ArrayList<>();
      List<Integer> list2 = new ArrayList<>();
      List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(list1.contains(nums1[i])==false && set2.contains(nums1[i])==false){
                list1.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
             if(list2.contains(nums2[i])==false && set.contains(nums2[i])==false){
                list2.add(nums2[i]);
            }
        }
        result.add(list1);
        result.add(list2);
        System.out.println(result);
    }
}
