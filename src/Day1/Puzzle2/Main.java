package Day1.Puzzle2;

public class Main {
    public static void main(String[] args) {

        PuzzleLinkedList list1 = new PuzzleLinkedList();
        list1.head = new IntegerNode(3);
        IntegerNode second1 = new IntegerNode(7);
        IntegerNode third1 = new IntegerNode(8);
        IntegerNode forth1 = new IntegerNode(10);

        list1.head.next = second1;
        second1.next = third1;
        third1.next = forth1;

        list1.printList();

        PuzzleLinkedList list2 = new PuzzleLinkedList();
        list2.head = new IntegerNode(99);
        IntegerNode second = new IntegerNode(1);

        list2.head.next = second;
        second.next = third1;

        list2.printList();

        System.out.println(IntersectingNode.findIntersectingNode(list1.head,list2.head));
    }
}



