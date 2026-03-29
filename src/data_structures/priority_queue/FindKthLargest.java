package data_structures.priority_queue;

import java.util.PriorityQueue;

public class FindKthLargest {
    public static int findKthLargest(int k, int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num: nums) {
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(k, nums));
    }
}
