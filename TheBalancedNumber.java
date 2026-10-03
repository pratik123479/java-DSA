public class solution{

    public static void main(String[] args){
       int n = 57294;

       String s = String.valueOf(n);

       int even=0;
       int odd=0;

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    int digit = ch - '0';
    if(i%2==0){
       even=even+digit;
    }else{
        odd=odd+digit;
    }
    }
    int diff=Math.abs(even-odd);
    System.out.println(diff);
  }
}
