package Day4.Puzzle4;

import java.util.ArrayList;
import java.util.List;

public class StringPalindrome {
    public static boolean palindromeChecker(String string){
        List<Character> list = new ArrayList<>();

        for ( int i = 0 ; i<string.length(); i++){
            // for loop goes through each character in string adding it to the arraylist if
            // it is not already in the list or removing it if said character is already in the list.
            // for "racecar" r -> add -> a -> add -> c -> add -> e -> add -> c -> remove -> a -> remove -> r -> remove
            // result is that e is the only character left in the arraylist
            if(list.contains(string.charAt(i))){
                list.remove((Character)string.charAt(i));
            } else {
                list.add(string.charAt(i));
            }
        }
        // if the character length is divisible by 2 (is even) AND the list is empty return true OR
        // if the remainder of division of 2 is 1 and the remaining list size is 1 return true
        // In the racecar example, all characters have been removed other than 'e', hence the remainder
        // of division is 1 and the arraylist has length 1
        return string.length() % 2 == 0 && list.isEmpty() ||
                (string.length() % 2 == 1 && list.size() == 1);
    }
}
