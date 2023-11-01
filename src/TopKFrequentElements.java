/*

    split the problem - 
        -   most frequent elements in an array and k most,
        -   order doesnt matter
        -   complexity must be better than O(n log n)
        
        
    Follow up -
        -   Are they sorted? - it's irrelavant, 
        -   Constraints - 10^5 elements - so brute force might not work.
        -   what if number of k most frequent elements are less than k in the array - addresseed in the question itself.
        -   Can I use O(n) space complexity?
        
        
    Brute force - 
        -   Keep count of occurance of nums[i] and num[i]
        -   O(n^2) is the complexity
        -   Sort the array and parse until k elemetns.
        
        
    Optimal -
        -   Required to parse complete array, frequest elements may also be at the end.
        -   Parse each and update it's count in a map, return top k elements.
        -   Complexity 
            -   O(n) + time required to sort ? instead of sorting can we maintain the count in an array/map and limit the size to k
        
    
    How -
        -   loop through the array,
        -   if found, and exits in map update the count. Can we use max heap ?
        -   Combination of map and array, map stores the element and count, array stores the index of elements
        
        
        
        better than O(nlog n) need not mean better than O(n) could also be O(nlog K)
        

*/


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TopKFrequentElements {

    public static void main(String[] args) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        topKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3, 3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == 0 || k == 0) return new int[0];

        Map<Integer, Integer> elementOccurance = new HashMap();

        //Map<Integer, Integer> maxKElements = new HashMap();

        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();

        for (Integer eachElement : nums) {

            if (elementOccurance.get(eachElement) == null) elementOccurance.put(eachElement, 1);

            else {
                int occurance = elementOccurance.get(eachElement);
                elementOccurance.put(eachElement, occurance + 1);

                if (sortedMap.size() < k) sortedMap.put(elementOccurance.get(eachElement), eachElement);

                else if (sortedMap.lastEntry().getValue() < elementOccurance.get(eachElement)) {

                    // sortedMap.pollLastEntry();

                    sortedMap.put(elementOccurance.get(eachElement), eachElement);
                }
            }
        }

        int[] num = new int[k];

        int count = 0;
        for (Integer int1 : sortedMap.keySet()) {
            num[count++] = int1;
        }


        return num;
    }
}