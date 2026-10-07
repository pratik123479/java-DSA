import java.util.HashSet;

public class anagram {
    public static void main(String[] args) {
        int arr1[]={4,9,5,8,8};
        int arr2[]={9,4,9,8,4};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        set.add(arr2[j]);
                        break;
                    }
        }
        }
        System.out.println(set);
    }
}
