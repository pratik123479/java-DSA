public class leetcode121 {
    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        int num=0;
        int profit=0;
        int maxprofit=0;
       
        for(int i=0;i<arr.length-1;i++){
            if(i==0){
                num=arr[i];
            }
            if(arr[i]<num){
                num=arr[i];
            }
            
            profit=arr[i+1]-num;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        System.out.println(maxprofit);
    }
}
