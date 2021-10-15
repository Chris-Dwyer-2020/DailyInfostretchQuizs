package Day6.Puzzle5;

import java.util.Arrays;

public class ReverseWords {

    public static void reverse(String input){

        char[] array = new char[input.length()];

        for (int i = 0; i< input.length(); i++){
            array[i] = input.charAt(i);
        }
    }




    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length -1;
        int halfLength = array.length/2;
        for ( int i=0; i< halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
