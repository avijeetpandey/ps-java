package neetcode.linkedlist;

public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        Node current = head;
        Node fastPointer = current;
        Node slowPointer = current;

        while(fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer) {
                return true;
            }
        }

        return false;
    }
}
