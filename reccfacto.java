public class solution{
    public static void main(String[] args){
        System.out.println(pan(5));
        
        }
    public static int pan(int n){
        if(n==1){
            return 1;
        }
        return n*pan(n-1);
    }    
}
