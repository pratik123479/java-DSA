public class solution{
    public static int num(int n){
        if (n/10==0){
            return n;
        }else{
            return n%10 + num(n/10);
        }
    }
    public static void main(String[] args) {
       System.out.println(num(7543));
    }
}
