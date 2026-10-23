public class leetcode1512{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int max=0;

        for(int i=0;i<arr.length-1;i++){int temp=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    max++;
                }
           
        }
    }
    
        System.out.println(max);
}}
