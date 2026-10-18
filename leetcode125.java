public class leetcode125 {
    public static void main(String[] args) {
       String s= " ";
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       boolean check=true;

        int i=0;
        int j=s.length()-1;
        
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            check=false;
            break;
        }
        i++;
        j--;
       }
       System.out.println(check);
    }
}
