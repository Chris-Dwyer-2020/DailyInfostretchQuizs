package Day3.Puzzle1;

public class SinglyLinkedList {

    // Nested static class which represents the nodes in a linkedlist
    static class ListNode {

        // fields for node value and pointer to next node
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

    }

    // field for the head node of the list
    private ListNode head;

    public void addToFront(ListNode node) {
            //Creating a new node
            ListNode listNode = new ListNode(node.value);
            // Setting the current head node to the next in the list
            listNode.setNext(head);
            // Set new node to head
            head = listNode;
        }

        public void printList() {
            ListNode current = head;
            System.out.print("HEAD -> ");
            while (current != null) {
                System.out.print(current.value);
                System.out.print(" -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public void reverseList() {
        // null -> 1(h) -> 2 -> 3
        //initialising pointer and previous fields
            // first pointing at the head (1)
            ListNode current = head;
            // heads previous value will now be null
            ListNode previous = null;
            //while current is not equal to null
            while (current != null) {
                //setting the next field (2)
                ListNode next = current.next;
                // next = previous (2)
                current.next = previous;
                // previous = current (1) which is also the head
                previous = current;
                // current = next (2)
                current = next;
            }
            // setting previous back to (1)
            head = previous;
        }
    }

