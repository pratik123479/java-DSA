public class solution{
    public static void tower(int n,String name){
        if(n<0){
            return;
        }
        System.out.print(name.charAt(n));
        tower(n-1,name);

       
    }
    public static void main(String[] args) {
        String name = "ABCD";
        tower(name.length() - 1, name);
    }
}
