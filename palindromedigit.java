public class palindrome{
    public static void main(String[] args) {
        int x = 12121;
        int d=x;
        int reverse=0;

        while(d>0){
            int p=d%10;
            reverse=reverse*10+p;
            d=d/10;
        }
        
        if(x==reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
