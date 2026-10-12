public class leetcode28 {
    public static void main(String[] args) {
        String haystack = "coleetode";
        String needle="coleetode";
        int x=needle.length();
        int k=haystack.length();
        int temp=-1;

        for (int i = 0; i <= k - x; i++) {
    if (haystack.substring(i, i + x).equals(needle)) {
        temp = i;
        break;
    }
}
        System.out.println(temp);

    }
}
