package Day3.Puzzle2;

public class  Tree {

    private TreeNode root;

    public void addNode(int key, String letter) {
        TreeNode newNode = new TreeNode(key, letter);

        if (root == null) {
            root = newNode;
        } else {
            TreeNode focusNode = root;
            TreeNode parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
}