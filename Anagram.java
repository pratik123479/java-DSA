import java.util.HashSet;

public class anagram{
    public static void main(String[] args) {
       HashSet<Character> set = new HashSet<>();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count =0;
        
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }

        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
