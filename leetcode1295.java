public class leetcode1295 {
    public static void main(String[] args) {
        int arr[]={100, 1000, 10000};
        int count =0;

        for(int i=0;i<arr.length;i++){
            int x =arr[i];
            int p=0;
            while(x>0){
                p++;
                x=x/10;
            }
            if(p%2==0){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
