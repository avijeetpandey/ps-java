package codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double total = n;
        double sum = 0.0;
        while(n > 0) {
            double drinkPercentage = in.nextDouble() / total;
            sum += drinkPercentage;
            n--;
        }
        System.out.println(sum);
        in.close();
    }
}
