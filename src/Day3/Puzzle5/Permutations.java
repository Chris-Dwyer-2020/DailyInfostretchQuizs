package Day3.Puzzle5;

public class Permutations {

    public static void numPermutations( String n, String result) {
        if(n.length() == 0){
            System.out.print(result + " ");
        }
        for (int i=0; i<n.length(); i++){
            char number = n.charAt(i);
            String left = n.substring(0,i);
            String right = n.substring(i + 1);
            String remaining = left + right;
            numPermutations(remaining, result + number);
        }

    }
}
