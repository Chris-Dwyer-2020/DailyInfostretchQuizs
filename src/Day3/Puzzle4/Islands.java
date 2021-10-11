package Day3.Puzzle4;

public class Islands {
    public static int numberOfIslands(char[][] matrix) {
        // Error checking for matrix existence
        if( matrix == null || matrix.length == 0){
            return 0;
        }
        // Set number of islands to zero to begin with
        // Need to traverse matrix using nested for-loop
        int islands = 0;
        for(int i = 0; i < matrix.length; i++){ // columns
            for (int j = 0; j<matrix[i].length; j++) { //rows
                if(matrix[i][j] == '1') {
                    // if seen 1, then have visited an island. BUT, do not want to
                    // have every 1 be counted as an island.
                    // So, using the dfs function, once a 1 has been seen, this function
                    // checks all of its neighbours for other 1's (syncing) before adding to the
                    // island count
                    islands += dfs(matrix,i,j);
                }
            }
        }
        // matrix has been searched, return number of islands found
        return islands;
    }

    public static int dfs(char[][] matrix, int i, int j) {
        // Error checking - want to check if every iteration is valid (hasn't gone out of bounds)
        if( i < 0 || i>= matrix.length || j < 0 || j >=matrix[i].length ||
                matrix[i][j] == '0') {
            //
            return 0;
        }
        // otherwise if the current element in matrix is a 1, want to set that element to
        // 0 so that it is not revisited, and then visit all of its surrounding neighbours.
        matrix[i][j] = '0';
        dfs(matrix, i + 1, j);
        dfs(matrix, i - 1, j);
        dfs(matrix, i, j + 1);
        dfs(matrix, i, j - 1);
        // once all of surrounding elements have been searched, want to return 1 to numberOfIslands
        // method above, which has now set any 1's belonging to that island to 0 in the matrix
        // preventing a recount at a future iteration
        return 1;
    }
}
