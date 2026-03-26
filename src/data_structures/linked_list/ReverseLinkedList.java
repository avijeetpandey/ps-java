package data_structures.linked_list;

import neetcode.linkedlist.Node;

public class ReverseLinkedList {
    public Node reverseLinkedList(Node head) {
        Node currentHead = head;
        Node prevNode = null;
        Node nextNode = null;

        while (currentHead != null) {
            nextNode = currentHead.next;
            currentHead.next = prevNode;
            prevNode = currentHead;
            currentHead = nextNode;
        }

        return prevNode;
    }
}
