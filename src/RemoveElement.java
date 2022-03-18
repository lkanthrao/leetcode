class RemoveElement {
    public static void main(String[] args) {
        removeElement(new int[]{1}, 1);
    }
    public static void removeElement(int[] nums, int val) {

        //  can the order be changed? yes

        int startCursor = 0, endCursor = nums.length - 1;

        // [2,2,2,3], val = 3

        while(startCursor < endCursor){

            if(nums[startCursor] != val)
                startCursor++;

            else if(nums[endCursor] == val)
                endCursor--;

            else{
                nums[startCursor] = nums[endCursor];
                startCursor++;
                endCursor--;
            }
        }
        startCursor++;
    }
}