public class BrainPower {

    public static void main(String[] args) {
        System.out.println(mostPoints(new int[][]{{3, 1}, {4, 1}, {8, 4}, {1, 5}}));
    }

    public static long mostPoints2(int[][] questions) {
        int numberOfQuestion = questions.length;
        long[] dynamicPorgramingArray = new long[numberOfQuestion + 1];
        for (int index = numberOfQuestion - 1; index >= 0; index--) {
            int point = questions[index][0];
            int skip = questions[index][1];

            long include = point + (index + skip + 1 >= numberOfQuestion ? 0 : dynamicPorgramingArray[index + skip + 1]);

            long exclude = dynamicPorgramingArray[index + 1];

            dynamicPorgramingArray[index] = Math.max(include, exclude);
        }
        return dynamicPorgramingArray[0];
    }

    public static long mostPoints(int[][] inputArray) {
        long[] tempArray = new long[inputArray.length];

        tempArray[inputArray.length - 1] = inputArray[inputArray.length - 1][0];

        for (int i = inputArray.length - 2; i >= 0; i--) {
            int jump = inputArray[i][1] + i + 1;
            jump = jump >= inputArray.length ? 0 : jump;
            tempArray[i] = Math.max(inputArray[i][0] + tempArray[jump], tempArray[i + 1]);
        }
        return tempArray[0];
    }

}
