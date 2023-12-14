class LongestCommonPrefix2 {

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix2().longestCommonPrefix(new String[]{"flower", "flowerrrrrrr"}));
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String firstIndexString = strs[0];

        int minLength = 200;

        for (int index = 1; index < strs.length; index++) {

            int tempMinLength = 0;

            for (int i = 0; i < strs[index].length() && i < minLength && i < firstIndexString.length(); i++) {
                if (strs[index].charAt(i) == firstIndexString.charAt(i)) {
                    tempMinLength++;
                } else if (tempMinLength < minLength) {
                    minLength = tempMinLength;
                    break;
                }
            }

            if (tempMinLength < minLength) {
                minLength = tempMinLength;
            }
        }
        return minLength == 200 ? firstIndexString : firstIndexString.substring(0, minLength);
    }

}