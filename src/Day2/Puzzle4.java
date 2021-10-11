package Day2;

public class Puzzle4 {

    public static void perfectNumber(int n) {
        if (n <= 0) {
            System.out.println("Not a valid number");
        }
        else if (n == 10 ){
            System.out.println(n);
        }
        else {
            int sum = 10 - n;
            System.out.println(n + "" + sum);
        }
    }
}
