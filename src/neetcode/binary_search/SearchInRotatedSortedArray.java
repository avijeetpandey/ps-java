package neetcode.binary_search;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        /**
         * The step involves finding the sorted part of the araay and apply the binary search there
         */

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (int) Math.floor((left+right)/2);
            if(nums[mid] == target) return mid;
            // check if the left half if the array is sorted
            // check if the right half of array is sorted
            if(nums[mid] < nums[right]) {
                if(nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(nums[mid] >= target && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 100));
    }
}
