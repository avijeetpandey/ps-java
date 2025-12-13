package dsa;

import java.util.HashSet;

public class ContainsDuplicate {
    boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(solution.containsDuplicate(nums)); // Output: true
    }
}
