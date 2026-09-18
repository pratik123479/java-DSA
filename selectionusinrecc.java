import java.util.Arrays;

public class selectionsort{

    public static void selection(int arr[],int r,int c,int i){
        if(r==0){
            return;
        }

        if(r>c){
            if(arr[c]>arr[i]){
                selection( arr, r,c+1,c);
            }
            else{
                selection( arr, r,c+1,i);
            }  
        }else{
              int temp=arr[i];
              arr[i]=arr[r];
              arr[r]=temp;
            selection( arr, r-1,0,i);
        }
    }
    public static void main(String [] args){
        int arr[]={5,3,7,2,8,4,0};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
