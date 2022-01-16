class Solution {

    public static void main(String[] args) {
        divideString("abcdefghij", 3, 'x');
    }

    public static String[] divideString(String s, int k, char fill) {


        if (s == null)
            return null;

        int mod = s.length() % k;

        if (mod != 0)
            for (int i = 0; i < k - mod; i++) {
                s = s.concat(String.valueOf(fill));
            }

        int divideNumberOfTimes = s.length() / k;

        String[] result = new String[divideNumberOfTimes];

        for (int i = 0; i < divideNumberOfTimes; i++) {
            result[i] = s.substring(i * k, (i * k) + k);
            System.out.println(result[i]);
        }

        return result;
    }
}