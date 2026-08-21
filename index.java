import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //middle stars
            for(int j=n;j>=1;j--){
                if(i==1 || j==1|| j==n || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            //last spaces
            for(int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
}
}