package codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        int count = 0;

        while(testCases > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a+b+c >= 2) {
                count++;
            }

            testCases--;
        }

        System.out.println(count);

        scanner.close();
    }
}
