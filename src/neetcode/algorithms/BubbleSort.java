package neetcode.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {999,-2,100,0,78,65};
        new BubbleSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
