package neetcode.linkedlist;

public class RemoveNthNodeFromEnd {
    public Node removeNthNodeFromEnd(Node head, int nodeNumber) {
        int sizeOfLL = 0;
        Node sizeNode = head;
        while(sizeNode != null) {
            sizeOfLL++;
            sizeNode = sizeNode.next;
        }

        if(sizeOfLL == nodeNumber) {
            return head.next;
        }

        int nodeFromFront = sizeOfLL - nodeNumber;
        Node current = head;

        int currentPosition = 1;

        while(currentPosition < nodeFromFront) {
            current = current.next;
            currentPosition++;
        }

        current.next = current.next.next;

        return head;
    }
}
