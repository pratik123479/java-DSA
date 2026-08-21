import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n=30;
        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            for(int k=i+1;k<=2*n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
            }


        for(int i=n;i>=1; i--){
            for(int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            for(int k=i+1;k<=2*n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
            }
            
        }

    }
