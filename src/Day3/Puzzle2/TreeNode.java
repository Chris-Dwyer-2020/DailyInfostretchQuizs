package Day3.Puzzle2;

public class TreeNode {

    public int key;
    public String letter;

    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int key, String letter) {
        this.key = key;
        this.letter = letter;
    }

    public String toString() {
        return letter + " has key " + key;
    }

}
