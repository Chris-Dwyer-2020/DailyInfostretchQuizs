package Day3.Puzzle4;

public class IslandMain {
    public static void main(String[] args) {

        char[][] islandMatrix = {{'1','0','0','0','0'},
                                 {'0','0','1','1','0'},
                                 {'0','1','1','0','0'},
                                 {'0','0','0','0','0'},
                                 {'1','1','0','0','1'},
                                 {'1','1','0','0','1'}};

        System.out.println("Number of islands in matrix: " + Islands.numberOfIslands(islandMatrix));

    }
}
