public class leetcode1704{
    public static boolean isvowel(char A){
        if(A=='a' || A=='e'|| A=='i'|| A=='o'|| A=='u'|| A=='A'|| A=='E'|| A=='I'||A=='O'||A=='U'){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "textbook";
        int a=0;
        int x=0;
        for(int i=0;i<s.length()/2;i++){
            if(isvowel(s.charAt(i))){
                a++;
            }
            if(isvowel(s.charAt(s.length()/2+i))){
                x++;
            }
        }
        if(a==x){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
