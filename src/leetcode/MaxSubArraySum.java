package leetcode;

/**
 * Time complexity - O(N)
 * Keep on adding till the current sum is negative , if the current sum is negative
 * start adding from the next element again ,
 * while adding always maintain max of sum so far and current sum
 */

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] elements = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int answer = elements[0];
        int currentSum = 0;
        for(int element: elements) {
            currentSum += element;
            answer = Math.max(answer, currentSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println(answer);
    }
}
