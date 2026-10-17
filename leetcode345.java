
class Solution {

    public boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' ||
            ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!isvowel(s.charAt(i))) {
                i++;
            } else if (!isvowel(s.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);

                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }
        }

        return sb.toString();
    }
}
