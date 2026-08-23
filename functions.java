import java.util.Scanner;

public class funct {

    public static void average(int n) {
       
        int sum=0;
        for (int i= 1 ; i<=n; i++){
            if (i%2==0){
                continue;
            }else{
                sum=sum+i;
            }
            System.out.println(i);
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no n:");
        int n = sc.nextInt();
        average(n);
       
}}
