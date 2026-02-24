package neetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        int actualSum = 0;
        for(int n: nums) {
            actualSum += n;
        }

        int missingNumber = sum - actualSum;
        return missingNumber;
    }
}
