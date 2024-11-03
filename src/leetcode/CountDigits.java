package leetcode;

public class CountDigits {
    public static void main(String[] args) {
        int n = 7;
        int copyOfDigit = n;
        int count = 0;
        while(copyOfDigit > 0) {
            int lastDigit = copyOfDigit % 10;
            if(n % lastDigit == 0) {
                count++;
            }
            copyOfDigit /= 10;
        }
        System.out.println(count);
    }
}
