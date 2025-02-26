package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);

            for(Map.Entry<Integer, Integer> en : map.entrySet()) {
               if(en.getValue() == 1) {
                   System.out.println(en.getKey());
                   break;
               }
            }

            t--;
        }

        scanner.close();
    }
}
