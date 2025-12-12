package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 131;
        String stringNumber = String.valueOf(number);
        String reversedNumber = "";

        for(int i = stringNumber.length() - 1; i>=0; i--) {
            reversedNumber += stringNumber.charAt(i);
        }

        System.out.println(reversedNumber);
        System.out.println(stringNumber);

        if(reversedNumber.equals(stringNumber)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
