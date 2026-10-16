public class leetcode485{
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,1,1,1,1};
        int x=0;
        int max=0;
        int min=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                x++;
            }
            if(x>max){
                max=x;
            }
            if(arr[i]==0){
                x=0;
            }
         }
         System.out.println(max);
    }
}
