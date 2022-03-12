class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 6, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // create a new array of length m + n

        // iterate through both at once, take the smallest element and put in new array.

        // clues/heads up/part of solved queries from questions

        int[] mergedResult = new int[m];

        int index1 = 0, index2 = 0, mergedIndex = 0;

        while (index1 < m) {

            if (nums1[index1] <= nums2[index2]) {
                mergedResult[mergedIndex] = nums1[index1];
                index1++;
            } else {
                mergedResult[mergedIndex] = nums2[index2];
                index2++;
            }

            mergedIndex++;
        }

        nums1 = mergedResult;

    }
}