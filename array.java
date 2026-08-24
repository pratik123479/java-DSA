import java.util.Scanner;

public class array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements in array:");
        int n = sc.nextInt();

        int marks[]= new int[n];

        for(int i=0; i<n ;i++){
            marks[i] = sc.nextInt();
            System.out.println();
        }

        

        System.out.println("enter the value of x:");
        int x = sc.nextInt();


        for(int i=0; i<n ;i++){
            if (marks[i]==x){
                System.err.println("the x occurs at index:"+ i);
            }
        }

    }
}
