package algorithms.firstnonrepeatingchar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

    public static Character firstNonRepeatingChar(String str) {
        // Create a new HashMap to store the count of occurrences
        // of each char.
        Map<Character, Integer> charCounts = new HashMap<>();
        char[] strChars = str.toCharArray();
        for (char i : strChars) {
            charCounts.put(i, charCounts.getOrDefault(i, 0) + 1);

        }
        for (char i : strChars) {
            if(charCounts.get(i) == 1){
                return i;
            }
        }
        return null;
    }

}