public class digitfrequency{
    public static void main(String[] args) {
        
        int num=112233450;
        int arr[]=new int[10];

        for(;num>0;){
            int x=num%10;
            num=num/10;
            arr[x]++;
        }  
        for(int i=0;i<arr.length;i++){
            System.out.println(i+":"+arr[i]);
        }
      }
}
