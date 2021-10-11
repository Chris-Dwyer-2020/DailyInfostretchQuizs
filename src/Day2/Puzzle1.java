package Day2;

public class Puzzle1 {
//Given a 2D matrix of characters and a target word, write
// a function that returns whether the word can be found in
// the matrix by going left-to-right, or up-to-down.

// The target word 'FOAM', you should return true, since it's
// the leftmost column. Similarly, given the target word 'MASS',
// you should return true, since it's the last row.

/*    char[][] matrix = {{'F','A','C','I'},
            {'O','B','Q','P'},
            {'A','N','O','B'},
            {'M','A','S','S'}};

        System.out.println(Puzzle1.exist(matrix,"FOAM"));
        System.out.println(Puzzle1.exist(matrix,"MASS"));*/

// Solved using a dfs (depth first search) algorithm. - find definition at bottom

    // EXIST METHOD

    // First want to iterate through the board and find the first letter if we can
    // If the cell we are on equals the first letter of the word AND we can
    // find the remainder of the word then want to return true.
    // If dfs function returns true, it means we can find all the other characters,
    // need to pass dfs function, board, current row(i), current column(j), count of
    // how many letters have been found and the word being searched for.

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){ // rows
            for( int j = 0; j < board.length; j ++){ //columns
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    //DFS METHOD

    // want to check if we found the remainder of the word the count as to be equal
    // to the words length
    // Next need to check if we have ever gone outside of the grid (out of bounds)
    // So, if we have gone left OR right off the rows(i) on the board OR
    // we have gone up OR down off the columns(j) on the board OR
    // we are currently on a cell in the grid, but the cell that we are on does not have
    // the letter we are looking for.
    // If we have got to this point, it means we have not found the remainder of the
    // word and we haven't gone out of bounds in the grid and we have found the character
    // that we are looking for.
    // Now continue iteration, need to stop any cells being used more than once to
    // make the word being searched for. (If word has the same letter more than once)
    // So want to mark each cell searched as used. Can do that setting each cell passed over
    // with an empty string. Need to also remember the value in than cell, so that we
    // can add it back into the grid after doing the full search.
    // storing the original layout of the board in temp
    // setting each searched cell to an empty space
    // From the current spot can we find the remainder of the word by traversing
    // right OR left OR up OR down
    // restoring previous value of the board

    public static boolean dfs(char[][] board, int i, int j, int count, String word) {
        if (count == word.length()){
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length ||
                board[i][j] !=word.charAt(count)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = dfs(board, i + 1, j, count + 1, word)
                || dfs(board, i - 1, j, count + 1, word)
                || dfs(board, i , j + 1, count + 1, word)
                || dfs(board, i, j - 1, count + 1, word);
        board[i][j] = temp;
        return found;
    }
}

// A standard DFS implementation puts each vertex of the graph into one of two categories:
//      1.Visited
//      2.Not Visited
// The purpose of the algorithm is to mark each vertex as visited while avoiding cycles.
// The DFS algorithm works as follows:
// Start by putting any one of the graph's vertices on top of a stack.
// Take the top item of the stack and add it to the visited list.
// Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the top of the stack.
// Keep repeating steps 2 and 3 until the stack is empty.


