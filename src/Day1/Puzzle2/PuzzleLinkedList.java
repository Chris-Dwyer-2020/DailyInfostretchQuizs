package Day1.Puzzle2;

public class PuzzleLinkedList {

    public IntegerNode head;


    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");


    }
}
