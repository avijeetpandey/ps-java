/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> topKFrequentElements = new ArrayList<>();

        // create a hashmap with frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // sort the map by value and return the first k elements
        Map<Integer, Integer> sortedbyValueMap = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        for (int key : sortedbyValueMap.keySet()) {
            if (k == 0)
                break;
            topKFrequentElements.add(key);
            k--;
        }

        return topKFrequentElements.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end
