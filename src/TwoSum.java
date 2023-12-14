import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static void main(String[] args) {
        Arrays.stream(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 17)).peek(System.out::println).toArray();
    }

    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[]{-1, -1};

        if (nums.length < 2) return resultArray;

        Map<Integer, Integer> valuesAndIndex = new HashMap<>();

        valuesAndIndex.put(nums[0], 0);

        for (int index = 1; index < nums.length; index++) {

            if (valuesAndIndex.containsKey(target - nums[index])) {

                resultArray[0] = index;
                resultArray[1] = valuesAndIndex.get(target - nums[index]);
                return resultArray;

//                 return resultArray{index, valuesAndIndex.get(target - nums[index])};
            } else
                valuesAndIndex.put(nums[index], index);
        }
        return resultArray;
    }
}