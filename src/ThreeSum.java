import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0, 0}));

    }

    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int pointer = 0; pointer < nums.length; pointer++) {
            int target = -nums[pointer];
            int leftPointer = pointer + 1;
            int rightPointer = nums.length - 1;

            if (pointer > 0 && nums[pointer] == nums[pointer - 1]) continue;

            while (leftPointer < rightPointer) {
                if (nums[leftPointer] + nums[rightPointer] == target) {
/*                    List<Integer> resultList = new ArrayList();

                    resultList.add(nums[pointer]);
                    resultList.add(nums[leftPointer]);
                    resultList.add(nums[rightPointer]);*/

                    result.add(Arrays.asList(nums[pointer], nums[leftPointer], nums[rightPointer]));

                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) leftPointer++;

                    while (rightPointer > leftPointer && nums[rightPointer] == nums[rightPointer - 1])
                        rightPointer--;
                    leftPointer++;
                    rightPointer--;

                } else if (nums[leftPointer] + nums[rightPointer] < target) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }

        return result;

    }
}
