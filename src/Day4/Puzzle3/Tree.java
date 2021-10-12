package Day4.Puzzle3;

public class Tree {

    private TreeNode root;

    public void insertLeft(int value){
        if ( root == null ){
            root = new TreeNode(value);
        }
        else {
            root.insertLeft(value);
        }
    }

}
