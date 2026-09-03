public class solution{
    public static void sortedarr(int arr[],int n){
        if(n==arr.length-1){
            System.out.println("Array is sorted");
            return ;
        }
        if(arr[n]<arr[n+1]){
            
        sortedarr(arr,n+1);
        }else{
            System.out.println("array is unsorted");
           
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        sortedarr(arr,0);
    }
}
