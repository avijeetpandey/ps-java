package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
