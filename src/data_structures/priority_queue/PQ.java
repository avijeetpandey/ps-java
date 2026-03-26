package data_structures.priority_queue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        // creating a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(21);
        minHeap.offer(32);
        minHeap.offer(11);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        // max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, (a,b) -> b-a);
        maxHeap.offer(9);
        maxHeap.offer(1);
        maxHeap.offer(99);
        maxHeap.offer(23);

        System.out.println("---- Max Heap -----");

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
