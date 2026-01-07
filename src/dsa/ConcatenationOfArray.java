public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] nums = { 1, 2, 3 };
        int[] concatenatedArray = solution.getConcatenation(nums);
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}