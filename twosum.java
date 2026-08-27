import java.util.*;;
public class twosum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {2,6, 7, 11, 15, 3};
    int target=9; 
    int a=0;
    int b=0;
    for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if (arr[i]+arr[j]==target){
                a=arr[i];
                b=arr[j];
                System.out.println(a+" + "+b +" = " + target);
            }
        }
       
    }
}}