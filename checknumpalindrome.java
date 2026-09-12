public class recurrsion {
    public static void main(String[] args) {
        int n=12321;
        int i = 1;
         for (int temp = n; temp >= 10; temp = temp / 10) {
            i = i * 10;
        }

        System.out.println(pan(n,i));
        int x = pan(n,i);
        if(n==x){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static int pan(int n, int i) {
        if (n == 0) {
            return 0;
        }
        return (n%10) *(i)+pan(n/10,i/10);
        
    }
}
