package algorithms.findduplicates;

import java.util.*;


public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE //
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////


    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);



    }

    private static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer, Boolean>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            if(hashMap.get(i) != null && !list.contains(i)){
                list.add(i);
            }
            hashMap.put(i,true);
        }
        return list;
    }
    /* Farklıyöntem:
    public static ArrayList<Integer> findDuplicates(int[] nums) {

        // Create a new HashMap to store the count of occurrences
        // of each integer.
        Map<Integer, Integer> numCounts = new HashMap<>();

        // Loop through each integer in the input array and update
        // its count in the HashMap.
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }

        // Create a new ArrayList to store the duplicate integers.
        List<Integer> duplicates = new ArrayList<>();

        // Loop through each entry in the HashMap and check if the
        // count of occurrences is greater than 1.
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        // Return the ArrayList of duplicate integers.
        return duplicates;
    }*/
}
