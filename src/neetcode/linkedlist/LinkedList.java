package neetcode.linkedlist;

public class LinkedList {
    private Node head;

    public void add(int data) {
        /**
         * 1. if there is no element make the head to the data passed
         * 2. if there is an element already iterate to the last of the linkedlist
         * 3. now point the next and create new node 
         */
        if(head == null) {
            head = new Node(data);
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    // search in the linked list
    public int search(int target) {
        if(head == null) return -1;

        Node current = head;
        int count = 0;

        while(current.next != null) {
            count++;

            if(current.data == target) {
                return count;
            }

            current = current.next;
        }

        return -1;
    }

    // reverse the linkedlist
    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
