package data_structures.linked_list;

import neetcode.linkedlist.Node;

public class LinkedListCycleDetection {
    public boolean hasCycle(Node head) {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer) {
                return true;
            }
        }

        return false;
    }
}
