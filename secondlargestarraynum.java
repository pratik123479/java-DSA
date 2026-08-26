import java.util.*;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
       int number[]={10, 5, 20, 8, 15,6};
       int x=number[0];
       int a=number[0];
       for (int i=0;i<number.length;i++){
          if (number[i] > x) {
                a = x;
                x = number[i];
            }
            else if (number[i] > a) {
                a = number[i];
            }
    }
    System.out.println(a);
}
