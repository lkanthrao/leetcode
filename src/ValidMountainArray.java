class ValidMountainArray {
    public static void main(String[] args) {
        validMountainArray(new int[]{1,2,0});
    }
    public static boolean validMountainArray(int[] arr) {
        
        int length = arr.length;
        
        int index = 0;
        
        // stop at the where you start to see the decrease.
        
        if(length < 3)
            return false;
        
        while(arr[index] < arr[index+1])
            index++;

        if(index == 0 || index == length - 1)
            return false;

        while(index < length - 1 && arr[index] > arr[index + 1])
            index++;
        
        return index == length - 1;
        

    }
}