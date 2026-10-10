import java.util.Arrays;

public class movezero {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for (int k=j;k<arr.length;k++){
            arr[k]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
