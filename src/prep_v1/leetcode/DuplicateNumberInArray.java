package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                duplicate = nums[i];
                break;
            } else {
                set.add(nums[i]);
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
