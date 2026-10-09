public class permutation {

    public static void stringperm(String newname,String name){
        if(name.length()==0){
            System.out.println(newname);
            return;
        }
        char x=name.charAt(0);

        for(int i=0; i<=newname.length(); i++){
          String f=newname.substring(0,i);
          String s=newname.substring(i,newname.length());
            stringperm(f+x+s,name.substring(1));
        }
    }
    public static void main(String[] args) {
        stringperm("","abc");
    }
}
