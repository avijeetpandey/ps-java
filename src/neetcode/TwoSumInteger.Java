package neetcode;

import java.util.HashMap;

public class TwoSumInteger {

    public int[] findIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int diff = target - nums[i];
            if(numToIndex.containsKey(diff)) {
                return new int[] {numToIndex.get(diff), i+1};
            }
            numToIndex.put(nums[i],i+1);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int target = 3;
        int[] result = new TwoSumInteger().findIndices(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}