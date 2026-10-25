public class sliding{
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k=4;
        int sum=0; 
        float maxaverage=0;

        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int maxsum=sum;

        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxaverage=(float)maxsum/k);
    }
}
