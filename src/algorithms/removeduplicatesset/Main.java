package algorithms.removeduplicatesset;

import com.sun.source.doctree.SeeTree;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }

    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> mySet = new HashSet<>(myList);
        return new ArrayList<>(mySet);
    }

}
