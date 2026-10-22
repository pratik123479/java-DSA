public class leetcode167 {
    public static void main(String[] args) {
        int arr[]={-1,0};
        int target=-1;
        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]==target){
                System.out.println(i+1);
                System.out.println(j+1);
                break;
            }
        }
    }
}
