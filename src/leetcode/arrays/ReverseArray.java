package leetcode.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6};
        int left = 0;
        int right = elements.length - 1;

        for(int i=0;i< elements.length -1;i++){
            int temp = elements[left];
            elements[left] = elements[right];
            elements[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(elements));
    }
}
