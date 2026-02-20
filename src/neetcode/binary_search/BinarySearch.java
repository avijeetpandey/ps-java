package neetcode.binary_search;

public class BinarySearch {
    // iterative binary search
    // Time complexity nlog(n)
    public static int search(int[] nums , int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
           int mid = (int) Math.floor((left+right)/2);
           if(nums[mid] == target) {
            return mid;
           }
           if(target > nums[mid]) {
            left = mid + 1;
           } else {
            right = mid - 1;
           }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int result = search(nums, 9);
        System.out.println(result);
    }
}
