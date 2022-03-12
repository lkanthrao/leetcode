import java.util.Arrays;

class DuplicateZeroes {

    public static void main(String[] args) {
        duplicateZeros(new int[]{0, 4, 1, 0, 0, 8, 0, 0, 3});
    }

    public static void duplicateZeros(int[] arr) {


        int arrayLength = arr.length;

        if (arrayLength == 0 || arrayLength == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int index = 0;


        while (index < arrayLength - 1) {
            // look for 0, posssibility - start, middle, end
            // if found, shift the array from next index if it's not at the end.
            if (arr[index] == 0) {
                // shift the array
                if (arrayLength - (index + 1) >= 0)
                    System.arraycopy(arr, index + 1 - 1, arr, index + 1, arrayLength - (index + 1));
                index = index + 2;
            }
            index = index + 1;
        }

        Arrays.stream(arr).sequential().forEach(System.out::print);
    }
}