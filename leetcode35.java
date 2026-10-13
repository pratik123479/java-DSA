public class leetcode35{
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target = 2;
        int x=0;
        boolean flag=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                System.out.println(i);
                break;
            }
            if(arr[arr.length-i-1]>target){
                 x=arr.length-i-1;
            }
        }
        if(flag==false){
            if(x==0){
                System.out.println(arr.length);
            }else{
            System.out.println(x);

            }
        }
    }
}