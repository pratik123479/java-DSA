import java.util.HashMap;

public class leetcode242 {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        boolean x=true;
        HashMap<Character,Integer> map=new HashMap<>();

        if(s.length()!=t.length()){
            x=false;
        }
        else{
            for (int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                  map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                 map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }else{
                x=false;
            }
        }}
        
        System.out.println(x);
    }
}
