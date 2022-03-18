import java.util.Arrays;

class RemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public static void removeDuplicates(int[] nums) {

        int index = 0, cursor = 0;

        for(int i = 0; i< nums.length; i++){

            if(nums[cursor] == nums[i]) continue;
            nums[cursor + 1] = nums[i];
            cursor++;
        }
        Arrays.stream(nums).forEach(System.out::print);

    }
}