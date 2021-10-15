package Day6.Puzzle3;

public class OrderedChar {

    public static void getInOrderYouPeskyChars(char[] array) {
            int pos = 0;
            char[] letters = {'R', 'G'};
            for (char letter : letters) {
                // searching for one letter at a time within the char array of letters
                // incrementing position as each letter is found
                for (int j = pos; j < array.length; j++) {
                    if (array[j] == letter) {
                        array[j] = array[pos];
                        array[pos] = letter;
                        pos++;
                    }
                }
            }
        }
    }


