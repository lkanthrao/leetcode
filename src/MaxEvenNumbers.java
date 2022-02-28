class MaxEvenNumbers {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{234, 45, 123}));
    }


    public static int findNumbers(int[] nums) {

        int numberOfEvenDigits = 0;
        int countOfDigit = 0;

        for (int eachNum : nums) {
            while (eachNum > 0) {
                countOfDigit++;
                eachNum = eachNum / 10;
            }
            numberOfEvenDigits = countOfDigit % 2 == 0 ? numberOfEvenDigits + 1 : numberOfEvenDigits;
            countOfDigit = 0;
        }
        return numberOfEvenDigits;
    }
}