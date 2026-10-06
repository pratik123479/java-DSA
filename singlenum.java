public class singlenum {
    public static void main(String[] args) {
        int arr[]={4,1,2,4,2};
        int ans[]=new int [arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans[i]++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(ans[i]==1){
                System.out.println(arr[i]);
            }
        }
    }
}
