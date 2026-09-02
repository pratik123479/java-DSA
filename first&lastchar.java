public class solution{
    public static int A=-2,B=-2;
    public static void Counting(int n, char alphabet,String name){
        if(n==name.length()){
            if (A==-2 ){
                System.out.println("The character "+alphabet+" is not present in the string");
                return;
            }
            else if (B==-2){
                System.out.println("A appears only at index: "+A);
                return;
            }else{
            System.out.println("A first appears at index :"+A+" and B first appears at index :"+B);
            return;
        }
        }
        char current = name.charAt(n);
        if (current==alphabet){
            if(A==-2){
                A=n;
            }else{
                B=n;
            }
        }
        Counting(n+1,alphabet,name);
    }
    public static void main(String[] args) {
        String name = "BCDAXYZ";
        Counting(0,'A',name);
    }
}
