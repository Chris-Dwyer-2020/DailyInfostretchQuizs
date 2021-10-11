package Day2;

public class testing {

    public static void main(String[] args) {

        int[] array = {10, 35, 56, 20};
        multiSets(array);
    }

    public static int multiSets ( int[] numbers) {
        // Start count
        int total = 0;
        // add all number together
        for (int i=0; i< numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println(total);
        return total;
    }
}
