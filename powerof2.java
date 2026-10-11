public class powerof2{

    public static boolean power(int n){
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        if (n % 2 != 0) {
            return false;
        }
        return power(n/2);
    }
    public static void main(String[] args) {
        int  n = 10;
        System.out.println(power( n));
    }
}
