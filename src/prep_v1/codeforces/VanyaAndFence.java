package codeforces;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFriends = scanner.nextInt();
        int heightOfFence = scanner.nextInt();

        int resultantWidth = 0;

        while(numberOfFriends > 0) {
            int heightOfFriend = scanner.nextInt();
            if(heightOfFriend > heightOfFence) {
                resultantWidth += 2;
            } else {
                resultantWidth += 1;
            }
            numberOfFriends--;
        }

        System.out.println(resultantWidth);

        scanner.close();
    }
}
