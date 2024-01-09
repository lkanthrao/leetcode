import java.util.Arrays;

class RotatedSortedArray {
    public int search(int[] nums, int target) {

        int length = nums.length;
        int i = 0;
        while (i + 1 < length && nums[i] < nums[i + 1]) {
            i++;
        }
        Arrays.sort(nums);
        int beg = 0, end = length - 1, mid;
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (target == nums[mid]) {
                if ((mid + i) >= (length - 1)) return mid + i - length + 1;
                return mid + i + 1;
            } else if (nums[mid] < target) beg = mid + 1;
            else end = mid - 1;

        }
        return -1;
    }
}