import java.util.Scanner;

public class findpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x");
        int x= sc.nextInt();
        System.out.print("enter the value of n");
        int n= sc.nextInt();
        int power=1;
        for (int i=1;i<=n;i++){
            power=power*x;
        }
        System.out.println("the value of x^n is:"+power);
    }
}
