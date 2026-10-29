import java.util.HashMap;

public class leetcode13{
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int x=0;
        HashMap<Character,Integer> map=new HashMap<>();

        map.put( 'I', 1);
        map.put( 'V', 5);
        map.put( 'X', 10);
        map.put( 'L', 50);
        map.put( 'C', 100);
        map.put( 'D', 500);
        map.put( 'M', 1000);

        for(int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                x=x+map.get(s.charAt(i));
            }else{
                x=x-map.get(s.charAt(i));
            }
            
        }
         x = x + map.get(s.charAt(s.length() - 1));
        System.out.println(x);
    }
}
