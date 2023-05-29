package algorithms.findpairsset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */

    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set1 = new HashSet<>();
        List<int[]> list= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if(set1.contains(target-arr2[j])){
                list.add(new int[]{target-arr2[j],arr2[j]});
            }
        }
        return list;

    }
}
