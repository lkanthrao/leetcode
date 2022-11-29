/*

    [abc,def,cba] IP 
    [abc,cba,def] OP
    
    -   empty ? -> what should be response
    -   Should I consider space ?
    -   Should just i re-arrange or create new array ?
        -   just rearrange and return different groups.
    -   No anagrams must be also placed in array.
    -   Constraints ?
    
    -   IP - [abc, def, cba]
    -   OP - [abc, cba], [def] and that's why the return is list of list.
    
    
    -   Brute force:
        Find anagram for each and store it in map, try finding other elments in this map, if found then group.
        Complexity: n! for each string - to find permutation, so it's n * n! <plus> find if exits in map, O(n)
        
    -   Optimised:
        - create hashcode for each string, a = 60, b= 61   
        - once it's created match(length and hashcode) it with alerady created map of hashcode, List of string with same hashcode, if matches add in the list
            or create a new entry.
        -Complexity - O(n)
        
    -   Most important - Hash code should be same for all permutaitons. Create a hashcode by multiplying index of each char * it's histogram and sum all of them at the end --> this won't work -> abc and gbc are same as per this.
    -   Only way is to separately check each char occurance. Like, Create a map <String abc, int[] eachCharOccurance>
    -   O(n^2)
    
    -   In nut shell, create an histogram and compare it with already existing ones. Or can we use heaps? the tree should look same because we insert anyway the integer. min heap or max heap.
    
    - Or we simply sort and store it. nlog(n)
    
    
*/

import java.util.*;

class Solution {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List EMPTY_LIST = new ArrayList();

        if (strs == null || strs.length == 0) return EMPTY_LIST;


        if (strs.length == 1) {
            EMPTY_LIST.add(strs[0]);

            List singleElement = new ArrayList();
            singleElement.add(EMPTY_LIST);

            return singleElement;
        }

        Map<Integer[], List<String>> histogramMap = new HashMap();


        for(int i = 0; i< strs.length ; i++){

            if(strs[i] == "9999999") continue;

            Integer[] streamOfOccurance = computeCharIndexAndCount(strs[i]);

            boolean flag =  compute(histogramMap, streamOfOccurance, strs[i]);

            if(flag)
                strs[i] = "9999999";
        }

        return new ArrayList(histogramMap.values());

    }

    public static boolean compute(Map<Integer[], List<String>> histogramMap, Integer[] streamOfOccurance, String eachElement) {

        if (histogramMap.size() == 0) {

            histogramMap.put(streamOfOccurance, Arrays.asList(eachElement));

            return false;
        }

        boolean found = true;

        for (Map.Entry entrySet : histogramMap.entrySet()) {

            found = true;

            Integer[] histogram = (Integer[]) entrySet.getKey();

            for (int i = 0; i < histogram.length; i++) {

                if (histogram[i] != streamOfOccurance[i]) {
                    found = false;
                    continue;
                }
            }

            if (found) {
                List<String> listFromMap = (List) entrySet.getValue();

                List<String> newList = new ArrayList<>();
                newList.addAll(listFromMap);
                newList.add(eachElement);

                histogramMap.put(histogram, newList);

                return true;
            }


            histogramMap.get(eachElement);

        }

        if (!found) {
            histogramMap.put(streamOfOccurance, Arrays.asList(eachElement));
            return false;
        }

        return false;
    }

    public static Integer[] computeCharIndexAndCount(String element) {

        char[] charArray = element.toCharArray();

        int[] integerArray = new int[26];

        for (char eachChar : charArray) {
            integerArray[eachChar - 'a']++;
        }

        return Arrays.stream(integerArray).boxed().toArray(Integer[]::new);
    }
}