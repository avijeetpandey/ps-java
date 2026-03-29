package data_structures.priority_queue;

import java.util.PriorityQueue;

public class FindKthClosedPoint {
    public int[][] kthClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> {
            int distA = a[0]*a[0] + a[1]*a[1];
            int distB = b[0]*b[0] + b[1]*b[1];
            return Integer.compare(distB, distA);
        });

        for(int[] point: points) {
            maxHeap.offer(point);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        while(k > 0) {
            result[--k] = maxHeap.poll();
        }

        return result;
    }
}
