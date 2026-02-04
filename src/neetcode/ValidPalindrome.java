package neetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        String s = "Was it a car or a cat I saw?";
        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(solution.isPalindrome(cleanedString));
    }
}
