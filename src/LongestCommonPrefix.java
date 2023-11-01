import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"lak", "lak", "la"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String result = "";
        for (int i = 0; i < strs[0].length() && i < strs[strs.length - 1].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            result = result.concat(String.valueOf(strs[0].charAt(i)));
        }


        return result;
    }/*

    - prefix can be at any position ?
    - what's the order, lerft to right
    - different length of strings
    - anywher in the string
    - should consider all the strings in the array

    Brute force - the char should present in all strings, so start with a char, and check if it exists in all of them, if so then increment char and move next.


*/

    static class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs.length == 0) {
                return "";
            }

            Arrays.sort(strs);

            String result = "";

            for (int i = 0; i < strs[0].length() && i < strs[strs.length - 1].length(); i++) {
                if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) break;

                result = result.concat(String.valueOf(strs[0].charAt(i)));
            }
            return result;
        }
    }
}
