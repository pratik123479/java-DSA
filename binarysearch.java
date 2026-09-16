public class binarysearch {
    public static void main(String [] args){

        int arr[]={1,2,3,4,5,6,7,8};
        int target=6;
        int start=0;
        int end =arr.length-1;

       for(;start<=end;){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            System.out.println("found at index"+mid);
            break;
        }
        if(target<arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
    }}
