package Day4.Puzzle3;


public class BinaryTreeTest {
    public static void main(String[] args) {

        TreeNode nodeRoot = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(-1);

        nodeRoot.setLeftChild(node1);
        nodeRoot.setRightChild(node2);
        node1.setRightChild(node3);
        node2.setRightChild(node4);
        node4.setRightChild(node5);

        Tree tree = new Tree(nodeRoot);

        System.out.println(tree.minSum());
    }
}
