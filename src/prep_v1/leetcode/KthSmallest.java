package leetcode;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 20, 15};
        int k = 4;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
