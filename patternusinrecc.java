public class solution{

    public static void pattern(int n , int m){
        if(n==0){
            return;
        }
        if(n>m){
            pattern(n,m+1);
            System.out.print(" * ");
        }else{
            
            pattern(n-1,0);
            System.out.println();
        }
    }

    public static void main(String []args){
        pattern(4,0);
    }
}
