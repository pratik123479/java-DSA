
import java.util.Arrays;
public class movezero {
    public static void main(String[] args) {
        int arr[]={0, 1,0, 0, 3, 12};

        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                 int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;   
                }

          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
