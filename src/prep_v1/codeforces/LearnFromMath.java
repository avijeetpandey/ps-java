package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnFromMath {

    public static boolean isCompositeNumber(int number) {
        if(number < 2) return false;
        for(int i=2; i<= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        ArrayList<Integer> compositeNumbers = new ArrayList<>();

        for(int i=1;i<= number;i++){
            if(isCompositeNumber(i)){
                compositeNumbers.add(i);
            }
        }

        for(int x : compositeNumbers){
            int difference = number - x;
            if(compositeNumbers.contains(difference)) {
                System.out.println(difference+ " "+ x);
                break;
            }
        }

        scanner.close();
    }
}
