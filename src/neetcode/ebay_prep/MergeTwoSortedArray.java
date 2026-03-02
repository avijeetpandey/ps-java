package neetcode.ebay_prep;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numsOne = { 10, 20, 20, 40, 0, 0 };
        int[] numTwo = { 1, 2 };

        merge(numsOne, numTwo);
    }
}
