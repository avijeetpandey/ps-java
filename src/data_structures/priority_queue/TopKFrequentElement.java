package data_structures.priority_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public int[] topKFrequentElement(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int i=0; i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int num: map.keySet()) {
            pq.add(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i<k;i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}
