package neetcode.ebay_prep;

public class PalindromeString {
    public boolean isPalindrome(String s) {
        int left = 0;
        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "");
        int right = cleanedString.length() - 1;

        while (left < right) {
            if(cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
