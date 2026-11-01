public class leetcode453 {
    public static void main(String[] args) {
        int arr[]={1,1,1};
        int smallest=arr[0];
        int total=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=smallest){
                total=total+arr[i]-smallest;
            }
        }
        System.out.println(total);
    }
}
