package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<String> magnets = new ArrayList<>();

        while (testCases-- > 0) {
            String magnetPieces = scanner.next();
            magnets.add(magnetPieces);
        }

        int groupsCount = 1;

        for(int i=0; i< magnets.size() - 1 ; i++){
            if(!Objects.equals(magnets.get(i), magnets.get(i + 1))){
                groupsCount++;
            }
        }

        System.out.println(groupsCount);

        scanner.close();
    }
}
