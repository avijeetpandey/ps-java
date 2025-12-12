package codeforces;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limakWeight = scanner.nextInt();
        int bobsWeight = scanner.nextInt();

        int count = 0;

        while (limakWeight <= bobsWeight) {
            limakWeight *= 3;
            bobsWeight *= 2;
            count++;
        }

        System.out.println(count);

        scanner.close();
    }
}
