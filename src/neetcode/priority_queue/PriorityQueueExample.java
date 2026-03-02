package neetcode.priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(34);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.add(34);
        queue.add(32);

        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.println(queue.iterator().next());
        }
    }
}
