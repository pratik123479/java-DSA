public class substring {

    public static void subseq(String name,String newname) {
        if(name.length()==0){
            System.out.println(newname);
            return;
        }
        char x=name.charAt(0);
        subseq(name.substring(1),newname+x);
        subseq(name.substring(1),newname);

    }
    public static void main(String[] args) {
        subseq("abc","");
    }
}
