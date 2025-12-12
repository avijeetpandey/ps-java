package codeforces;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String gameState = in.next();

        int antonCount = 0;
        int danikCount = 0;

        for (char c : gameState.toCharArray()) {
            if (c == 'A') {
                antonCount++;
            } else if (c == 'D') {
                danikCount++;
            }
        }

        if (antonCount > danikCount) {
            System.out.println("Anton");
        } else if (danikCount > antonCount) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        in.close();
    }
}
