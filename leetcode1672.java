public class leetcode1672{
    public static void main(String[] args) {
        int arr[][]={{1,4,6,2,3},{3,4,2,1}};
        int max=0;

        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr[i].length;j++){
                temp=temp+arr[i][j];
            }
            if(temp>max){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
