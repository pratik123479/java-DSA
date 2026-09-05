public class Solution {

    public static void subsequences(String str, int index, String newString) {

        // Base case
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        // Take the current character
        subsequences(str, index + 1, newString + str.charAt(index));

        // Don't take the current character
        subsequences(str, index + 1, newString);
    }

    public static void main(String[] args) {

        String str = "abc";

        subsequences(str, 0, "");
    }
}
