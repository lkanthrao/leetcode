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
            } else valuesAndIndex.put(nums[index], index);
        }
        return resultArray;
    }

    public int[] attempt2(int[] arrayOfIntegers, int target) {


//        int[] arrayOfIntegers = new int[]{3, 4, 1, 6, 7};

        target = 8;

        /*
         * Can I use hashmap, as insertion and retrieve order is 1
         *
         * */

        if (arrayOfIntegers.length < 2 || arrayOfIntegers.length > Integer.MAX_VALUE - 1) return new int[]{-1, -1};


        HashMap<Integer, Integer> viewedElements = new HashMap<>();

        for (int i = 0; i < arrayOfIntegers.length; i++)
            if (viewedElements.containsKey(target - arrayOfIntegers[i])) {
                return new int[]{viewedElements.get(target - arrayOfIntegers[i]), i};
            } else {
                viewedElements.put(arrayOfIntegers[i], i);
            }

        return new int[]{-1, -1};
    }
}