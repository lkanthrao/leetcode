class HeightChecker {

    public static void main(String[] args) {
        heightChecker(new int[]{1,1,4,2,1,3});
    }
    public static int heightChecker(int[] heights) {
        
        // Options - sort and compare arrays.
        
        // Or - sort and compare at the same time and increment the counter.
        
        
        // random, no garantee .. so we may have to parse it until the end.
        
        // 
        
        int currentIndex = 0;
        
        int length = heights.length - 1;
        
        int[] expectedArray = new int[heights.length];
        
        int differences = 0;
        
        for(; currentIndex < heights.length - 1 ; currentIndex++){
            
            int currentGreatest = 0;
            
            for(int i = 0; i < heights.length - 1; i++ ){
                if(currentGreatest < heights[i] && (expectedArray[length] == 0 || heights[i]< expectedArray[length])){
                    currentGreatest = heights[i];
                }
            }
            
            expectedArray[length--] = currentGreatest;
            
            if(expectedArray[length] == heights[length])
                differences++;
        }
        
        return differences;
        
    }
}