package Day1.Puzzle1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Puzzle1 {

    public static void sumOfTwoNumbersInArray(Integer[] a, int v) {
        Set<Integer> n = new HashSet<Integer>(Arrays.asList(a));
        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            diff = v - a[i];
            if (n.contains(diff)) {
                System.out.print(a[i] + " ");
            }
        }
    }
}


