public class leetcode58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int l=s.length()-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(l-i)==' '&& count==0){
                continue;
            }
            else if(s.charAt(l-i)!=' '){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
