package Day6.Puzzle4;

public class SubSequenceTesting {
    /* lis() returns the length of the longest
     increasing subsequence in arr[] of size n */
    static int lis(int[] array, int arrayLength) {
        // first creating a sub sequence array
        int[] subSequence = new int[arrayLength];
        int i;
        int j;
        int max = 0;
        // Setting all elements in subsequence array to 1
        for (i = 0; i < arrayLength; i++) {
            subSequence[i] = 1;
            // Now comparing the input array with the subsequence array with all 1 values
            // Initialising i to element 2 and j to element 1
            for (i = 1; i < arrayLength; i++) {
                for (j = 0; j < i; j++) {
                    if (array[i] > array[j] && subSequence[i] < subSequence[j] + 1) {
                        subSequence[i] = subSequence[j] + 1;
                    }
                }
            }
        }
        // looping over the subsequence array to find the maximum integer stored
        // representing the largest increasing subsequence in the input array
        for (i = 0; i < arrayLength; i++) {
            if (max < subSequence[i]) {
                max = subSequence[i];
            }
        }
        return max;
    }
}
