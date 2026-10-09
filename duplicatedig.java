import java.util.HashSet;

public class duplicate{
    public static void main(String[] args){
      int arr[]={1,2,3,1};
      HashSet<Integer> set=new HashSet<>();

      for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
      }
      if(arr.length==set.size()){
        System.out.println("false");
      }else{
        System.out.println("true");
      }
    }}
