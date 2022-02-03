import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("O/P: " + findLongestSubstring("abccxyz"));
    }

    public static int findLongestSubstring(String input) {

        if (input == null || input.length() == 0) return 0;

        Set<Character> storeUniqueValues = new HashSet<>();

        int maxSubstringLength = 1;

        int index = 0;

        while (index < input.length()) {
            storeUniqueValues.add(input.charAt(index));
            int currentMax = 1;

            for (int j = index + 1; j < input.length(); j++) {
                if (!storeUniqueValues.contains(input.charAt(j))) {
                    storeUniqueValues.add(input.charAt(j));
                    currentMax++;
                } else {
                    break;
                }
            }
            maxSubstringLength = Math.max(maxSubstringLength, currentMax);
            storeUniqueValues.clear();

            index++;
        }
        return maxSubstringLength;
    }

}
