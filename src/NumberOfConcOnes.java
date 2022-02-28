public class NumberOfConcOnes {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 0, 1, 1, 0, 1, 1, 1};

        int count = 0, maxOnes = 0;

        for (int num : nums) {

            count = (num == 1) ? count + 1 : 0;

            maxOnes = Math.max(maxOnes, count);
        }

        System.out.println(maxOnes);
    }
}
