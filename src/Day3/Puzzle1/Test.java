package Day3.Puzzle1;

public class Test {
    public static void main(String[] args) {


        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addToFront(new SinglyLinkedList.ListNode(1));
        linkedList.addToFront(new SinglyLinkedList.ListNode(2));
        linkedList.addToFront(new SinglyLinkedList.ListNode(3));
        linkedList.addToFront(new SinglyLinkedList.ListNode(4));
        linkedList.addToFront(new SinglyLinkedList.ListNode(5));

        linkedList.printList();

        linkedList.reverseList();

        linkedList.printList();

    }
}
