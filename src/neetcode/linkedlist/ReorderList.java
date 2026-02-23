package neetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList {
    public void reorderList(Node head) {
        Node current = head;
        Deque<Node> dq = new ArrayDeque<>();

        while(current != null) {
            dq.addLast(current);
            current = current.next;
        }

        current = dq.pollFirst();
        boolean takeFromFirst = true;
        
        while (!dq.isEmpty()) {
            if(!takeFromFirst) {
                current.next = dq.pollFirst();
            } else {
                current.next = dq.pollLast();
            }
            current = current.next;
            takeFromFirst = !takeFromFirst;
        }

        current.next = null;
    }
}
