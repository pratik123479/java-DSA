import java.util.HashSet;
public class leetcode368{
    public static void main(String []args){
        int arr[]={ 0};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int x=0;
        for(int i=0;i<=arr.length;i++){
            if(set.contains(x)==false){
                System.out.println(x);
                break;
            }
            x++;
        }
    }
}
