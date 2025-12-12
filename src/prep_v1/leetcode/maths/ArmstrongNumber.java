package leetcode.maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int copyOfNumber = number;

        while(copyOfNumber > 0) {
            int digit = copyOfNumber % 10;
            sum += (int) Math.pow(digit, 3);
            copyOfNumber /= 10;
        }

        if(sum == number) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();
    }
}
