package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        Set<Character> characterSet = new HashSet<>();

        for(char c : username.toCharArray()) {
            characterSet.add(c);
        }

        if(characterSet.size() %2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        scanner.close();
    }
}
