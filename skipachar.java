public class skipachar{

    public static void skipchar(String name,int i,String result,char a){
        if(i==name.length()){
            System.out.println(result);
            return;
        }
        if(name.charAt(i)!=a){
            skipchar(name,i+1,result+name.charAt(i),a);
        }else{
           skipchar(name,i+1,result,a); 
        }
    }
    public static void main(String [] args){
        String name="baccad";
        skipchar(name,0,"",'a');
    }
}
