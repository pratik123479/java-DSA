import java.util.Arrays;
public class leetcode75{
    public static void main(String[] args) {
        int arr[]={2, 2, 0, 2, 1, 0, 2};
        int red=0;;
        int white=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                red++;
            }else if(arr[i]==1){
                white++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(i<red){
                arr[i]=0;
            }else if(i<red+white){
                arr[i]=1;
            }else{
                arr[i]=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
