import java.util.HashMap;

class RomanToInt {

    static HashMap<Character, Integer> romanToNum = new HashMap<>();

    static {
        romanToNum.put('I', 1);
        romanToNum.put('V', 5);
        romanToNum.put('X', 10);
        romanToNum.put('L', 50);
        romanToNum.put('C', 100);
        romanToNum.put('D', 500);
        romanToNum.put('M', 1000);
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("IV"));
    }

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;

        int prevRomanInt = 0;
        int totalSum = 0;

        for (int index = s.length() - 1; index >= 0; index--) {
            Integer currentRomanInt = romanToNum.get(s.charAt(index));
            totalSum = prevRomanInt > currentRomanInt ? totalSum - currentRomanInt : totalSum + currentRomanInt;
            prevRomanInt = currentRomanInt;
        }
        return totalSum;
    }
}