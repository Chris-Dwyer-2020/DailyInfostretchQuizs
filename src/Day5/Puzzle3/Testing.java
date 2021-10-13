package Day5.Puzzle3;

public class Testing {
    public static void main(String[] args) {

        String str1 = "foo";
        String str2 = "bar";

        if (CharacterMapping.canMap(str1, str2)) {
            System.out.print(str1 + " and " + str2 + " can be mapped");
        } else {
            System.out.print(str1 + " and " + str2 + " cannot be mapped");
        }
    }
}
