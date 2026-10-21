public class leetcode3701 {
    public static void main(String[] args) {
        int arr[]={100};
        int x=0;
        for(int i=0;i<arr.length;i++){
            if (i%2==0){
                x=x+arr[i];
            }
            else{
                x=x-arr[i];
            }
            
        }
        System.out.println(x);
    }
}
