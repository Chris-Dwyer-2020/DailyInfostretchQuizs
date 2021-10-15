package Day6.Puzzle1;

import java.util.Arrays;

public class ProductArray {

    public static int[] productNumbersArray(int[] array) {
        int sum = 1;
        int[] empty = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        Arrays.fill(empty, sum);
        for (int j = 0; j<empty.length; j++){
            empty[j] /= array[j];
        }
        System.out.println(Arrays.toString(empty));
        return empty;
    }
}

