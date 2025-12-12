package codeforces;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int o1 = a + (b*c);
        int o2 = a*(b+c);
        int o3 = a*b*c;
        int o4 = (a+b)*c;
        int o5 = (a+b+c);

        int result = Math.max(o1, Math.max(o2, Math.max(o3, Math.max(o4, o5))));

        System.out.println(result);

        scanner.close();
    }
}
