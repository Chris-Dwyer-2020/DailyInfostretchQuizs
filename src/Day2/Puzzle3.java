package Day2;

import java.util.Arrays;

public class Puzzle3 {

    public static void maxProduct(int[] array, int n){
        if (n < 3){
            System.out.println("Not enough elements in array, please enter 3.");
        }
        else {
            // Sort the array in ascending order
            Arrays.sort(array);
            // returns the maximum product of the last three elements
            // as well as the product of first two elements and the last
            int max = Math.max(array[0] * array[1] * array[n - 1],
                    array[n - 1] * array[n - 2] * array[n - 3]);
            System.out.println("Maximum product is " + max);
        }
    }


/*
    public static void maxProduct(int[] array, int n) {
        if (n < 3) {
            System.out.println("Not enough elements in array, please enter 3.");
        } else {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n - 2; i++)
                for (int j = i + 1; j < n - 1; j++)
                    for (int k = j + 1; k < n; k++)
                        max = Math.max(max, array[i] * array[j] * array[k]);
                                System.out.println("Maximum product is " + max);
        }
    }*/

}
