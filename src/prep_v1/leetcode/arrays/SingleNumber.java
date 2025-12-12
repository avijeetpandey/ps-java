package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a: nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
