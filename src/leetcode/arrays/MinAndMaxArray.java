package leetcode.arrays;

import java.util.Arrays;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,56,10000,167};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
