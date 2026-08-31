public class recurssion{

    public static void fibonnaci(int n, int i, int j){
        if (n==0){
            return;
        }
        int a = i+j;
        System.out.println(a);
        fibonnaci(n-1,j,a);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(0 );
        System.out.println(1 );

        fibonnaci(n-2,0,1);
        }
}
