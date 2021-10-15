package Day6.Puzzle4;

public class SubSequence {
    public static void main(String[] args) {
        int[] array = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15 };
        int n = array.length;
        System.out.println("Length of longest increasing subsequence is: "
                + SubSequenceTesting.lis(array, n));
    }
}

