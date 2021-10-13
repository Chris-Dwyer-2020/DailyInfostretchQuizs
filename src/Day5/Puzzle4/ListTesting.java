package Day5.Puzzle4;

import Day3.Puzzle1.SinglyLinkedList;

public class ListTesting {
    public static void main(String[] args) {

        RotatingList linkedList2 = new RotatingList();

        linkedList2.addToFront(new Node(5));
        linkedList2.addToFront(new Node(3));
        linkedList2.addToFront(new Node(7));
        linkedList2.addToFront(new Node(7));

        System.out.println("Original linked list");
        linkedList2.printList();

        linkedList2.rotate(2);

        System.out.println("Rotated Linked List");
        linkedList2.printList();
        System.out.println();

        RotatingList linkedList1 = new RotatingList();

        linkedList1.addToFront(new Node(5));
        linkedList1.addToFront(new Node(4));
        linkedList1.addToFront(new Node(3));
        linkedList1.addToFront(new Node(2));
        linkedList1.addToFront(new Node(1));

        System.out.println("Original linked list");
        linkedList1.printList();

        linkedList1.rotate(3);

        System.out.println("Rotated Linked List");
        linkedList1.printList();

    }
}
