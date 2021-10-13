package Day5.Puzzle4;

// 1. turn list into a circular loop
// 2. cut loop at kth value where new tail and head are joined
// 3. point next for tail to null

public class RotatingList {

    private Node head;

    public void rotate(int k) {
        Node oldHead = head;
        Node current = head;
        Node previous = null;
        // Traversing to end of linked list to get end node
        // for k = 1..... 1 -> 2 -> 3(end) ->
        while (current != null) {
            previous = current;
            current = current.getNext();
        }
        // Pointing previous(last node in list) to the head
        // for k = 1 ....  -> 1 -> 2 -> 3 ->(pointing to 1)
        previous.setNext(oldHead);

        Node kthNode = oldHead;
        Node nodeBeforeKthNode = oldHead;
        // looping along from head to node new end node
        for (int i = 0; i < k - 1; i++) {
            kthNode = kthNode.getNext();
            nodeBeforeKthNode = nodeBeforeKthNode.getNext();
        }
        //Moving kthnode an additional position forward
        kthNode = kthNode.getNext();
        //set kth node to head
        head = kthNode;
        // setting node before new head to point to null
        nodeBeforeKthNode.setNext(null);

    }

    public void addToFront(Node newData) {
        Node newNode = new Node(newData.getValue());
        newNode.setNext(head);
        head = newNode;
    }

    public void printList() {
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getValue());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

   /* public void originalRotate(int k) {
        if (k == 0)
            return;

        Node current = head;

        int count = 0;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null)
            return;

        Node kthNode = current;
        while (current.next != null) {
            current = current.next;
            current.setNext(head);
            head = kthNode.next;
            kthNode.setNext(null);
        }
    }*/
}
