public class solution{
    public static int num(int n,int m){
        if (n/10==0){
            m=m*10+n;
            return m;
        }else{
            int digit=n%10;
            m=m*10+digit;
            return  num(n/10,m);
        }
    }
    public static void main(String[] args) {
       System.out.println(num(7543,0));
    }
}
