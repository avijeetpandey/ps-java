package codeforces;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine().toUpperCase();
        String secondString = scanner.nextLine().toUpperCase();

        int result = firstString.compareTo(secondString);

        if(result > 0) {
            System.out.println("1");
        } else if(result < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
