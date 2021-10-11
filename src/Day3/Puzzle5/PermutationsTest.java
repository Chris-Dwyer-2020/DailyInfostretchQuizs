package Day3.Puzzle5;

import java.util.Scanner;

public class PermutationsTest {
    public static void main(String[] args) {
        String n;
        String result = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: " );
        n = scanner.next();
        System.out.print("\nAll possible number permutations are: ");
        Permutations.numPermutations(n,result);

    }
}
