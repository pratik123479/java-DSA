 public class solution{
    public static void main(String []args){
        int[] arr = {10, 5, 20, 8, 20, 15};
        int a=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
            }
        }
        System.out.println(a);
    }
 }
