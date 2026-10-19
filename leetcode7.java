public class leetcode7 {
    public static void main(String[] args) {
        int num=1534236469;
        long rev=0;
        while(num!=0){
            int x=num%10;
            rev=rev*10+x;
            num=num/10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
    System.out.println(0);
} else {
    System.out.println(rev);
}
    }
}
