package algorithms.longestconsecutivesequenceset;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums = {100,101, 4, 200, 1, 3, 2};
        int longest = longestConsecutiveSequence(nums);
        System.out.println(longest);

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int longestStreak =0;
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        for (int num:numSet) {
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak =1;
                while (numSet.contains(currentNum+1)){
                    currentNum ++;
                    currentStreak++;
                }
                if(currentStreak>longestStreak) {
                    longestStreak = currentStreak;
                }
            }

        }
        return longestStreak;

    }
}
