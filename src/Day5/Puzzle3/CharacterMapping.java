package Day5.Puzzle3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterMapping {
    public static boolean canMap(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        // Use a set to keep track of already mapped characters.
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // If c1 has been encountered before:
            if (map.containsKey(c1)) {
                // Return false if first occurrence of c1 is mapped to
                // a different character.
                if (map.get(c1) != c2)
                    return false;
            }
            // If c1 is encountered for the first time, it has not been mapped yet:
            else {
                // Return false if c2 is already mapped to some other char in str1
                if (set.contains(c2))
                    return false;

                // All checks passed. So insert in the map, and the set.
                map.put(c1, c2);
                set.add(c2);
            }
        }
        return true;
    }
}
