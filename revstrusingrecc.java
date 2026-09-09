public class solution{
    public static void revstring(int n ,String name,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        char newchar=name.charAt(n-1);
        revstring(n-1,name,ans+newchar);
    }
    
    public static void main(String []args){
       revstring(3,"abc","");
    }
}
