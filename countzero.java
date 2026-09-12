public class countzero {
    public static void main(String[] args) {
        int n=1203;
        countz(n,0);
    }

    public static void countz(int n,int count){
        if(n==0){
            System.out.println(count);
            return ;
        }
        if(n%10==0){
            count++;
        }
        countz(n/10,count);
    }
}
