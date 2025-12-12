package codeforces;

import java.util.Scanner;

public class ABAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            int n = scanner.nextInt();

            int firstDigit = n % 10;
            n = n / 10;

            System.out.println(n + firstDigit);

            t--;
        }

        scanner.close();
    }
}
