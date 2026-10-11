public class prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String name="";
        int x=0;
        
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[x].length()) {
                x = i;
    }
}
        for(int k=0;k<strs[x].length();k++){
            int count =0;
                for(int j=0;j<strs.length;j++){
                    if (strs[0].charAt(k) == strs[j].charAt(k)) {
                    count++;
                }
                }
                if(count==strs.length){
                   name= name+strs[x].charAt(k);
                 }else{
                     break;
                 }
        }
        System.out.println(name);
    }}
