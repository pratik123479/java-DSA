public class solution{
    public static StringBuilder k= new StringBuilder();
    public static int m=0;
    public static void replacechar(String name, int n,char letter){
        if(n==name.length()){

            return;
        }
       if(name.charAt(n)==letter){
         m++;
       }else{
        k.append(name.charAt(n));
       }
       replacechar(name,n+1,letter);
    }
    public static void main(String args[]){
        String name="axbxcxxd";
        char letter='x';
        replacechar(name,0,letter);

        for (int i=0;i<m;i++){
            k.append(letter);
        }
        System.out.println(k);
    }
}
