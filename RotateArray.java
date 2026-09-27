import java.util.Arrays;
public class rotatearray{
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7};
        int n=3;
        int newarr[]=new int[arr.length];
        int count=0;
        
        for(int i=n;i<arr.length;i++){
                newarr[count]=arr[i];
            count++;
        }
        for(int i=0;i<n;i++){
            newarr[count]=arr[i];
            count++;
        }

        System.out.println(Arrays.toString(newarr));
    }
}
