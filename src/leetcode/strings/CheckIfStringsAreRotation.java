package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class CheckIfStringsAreRotation {
    public static void main(String[] args) {
        String one = "mightandmagic";
        String two = "andmagicmigth";
        boolean isRotated = true;

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for(char c: one.toCharArray()) {
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }

        for(char c: two.toCharArray()) {
            secondMap.put(c, secondMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: firstMap.entrySet()) {
            if(entry.getValue() != secondMap.get(entry.getKey())) {
                isRotated = false;
                break;
            }
        }

        System.out.println(firstMap);
        System.out.println(isRotated);
    }
}
