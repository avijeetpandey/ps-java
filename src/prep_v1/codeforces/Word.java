package codeforces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(char c : word.toCharArray()) {
            if(Character.isUpperCase(c)) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }

        if(upperCaseCount == lowerCaseCount || lowerCaseCount > upperCaseCount) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }

        scanner.close();
    }
}
