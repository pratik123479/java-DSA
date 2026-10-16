import java.util.HashMap;

public class leetcode389 {
    public static void main(String[] args) {
        String s = "aab", t = "baac";
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();

        for(int i=0;i<t.length();i++){
           if(i<t.length()-1 && map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
           }else if(i<t.length()-1 && map.containsKey(s.charAt(i))==false){
                map.put(s.charAt(i),1 );
            }

            if( map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i), map1.get(t.charAt(i))+1);
           }else{
                map1.put(t.charAt(i),1 );
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))==false){
                System.out.println(t.charAt(i));
            }else if(map.get(t.charAt(i))!= map1.get(t.charAt(i))){
                System.out.println(t.charAt(i));
                break;
            }
        }
    }
    
}
