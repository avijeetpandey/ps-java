package leetcode.strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abc";
        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}
