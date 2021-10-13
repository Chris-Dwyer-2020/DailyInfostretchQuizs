package Day5.Puzzle5;

import java.util.HashSet;

public class LongestSubArray {

    public static int lengthOfLongestSubArray(int[] array) {
        int subArrayLength = 1;
        // New hashset
        HashSet<Integer> set = new HashSet<>();
        // Add set with with 1st element of input array
        set.add(array[0]);
        // Initialise i to the 1st element and j the 2nd
        int i = 0;
        int j = 1;
        while (j < array.length) {
            // If current j element is not already in set, increase subArrayLength, add current
            // value of j to set and move j to next element in array
            if (!set.contains(array[j])) {
                subArrayLength++;
                set.add(array[j++]);
            } else {
                // remove current value of i element from set, move i to next element in array
                set.remove(array[i++]);
                // decrement subArray length
                subArrayLength--;
            }
        }
        return subArrayLength;
    }
}
