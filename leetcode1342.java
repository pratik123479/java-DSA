public class leetcode1342{

    public static int reducezero(int n){
       return helper(n,0);
    }

    public static int helper(int n,int count){
        if(n==0){
            return count;
        }

        if(n%2==0){
            n=n/2;
            count++;
            return helper(n,count);
        }else{
            n=n-1;
            count++;
            return helper(n,count);
        }
        
        
    }
    public static void main(String []args){
        System.out.println(reducezero(8));
    }
}