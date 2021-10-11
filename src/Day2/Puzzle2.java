package Day2;

public class Puzzle2 {
    public static boolean multiSets(int[] numbers){
        // Start count
        int total = 0;
        // Add all numbers in array together
        for(int i = 0; i<numbers.length; i++){
            total += numbers[i];
        }
        // If total is not even return false
        if(total % 2 != 0) {
            return false;
        }
        // Else return overloaded method
        return multiSets(numbers, 0,0,total);
    }

    public static boolean multiSets(int[] numbers, int index, int sum, int total) {
        // Truthy base case
        // If the sum of the current subset * 2 equals the total
        if(sum * 2 == total){
            return true;
        }
        // falsy base case
        if(sum > total / 2 || index >= numbers.length) {
            return false;
        }
        // Recursive calls - continue until hit the base case.
        return multiSets(numbers,index + 1, sum, total) ||
                multiSets(numbers, index+1, sum+numbers[index], total);
    }
}