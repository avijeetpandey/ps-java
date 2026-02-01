package neetcode;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxFrequency = 0;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            char elementToInsert = s.charAt(r);
            frequencyMap.put(elementToInsert, frequencyMap.getOrDefault(elementToInsert, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(elementToInsert));

            char elementToRemove = s.charAt(l);
            while ((r - l + 1) - maxFrequency > k) {
                frequencyMap.put(elementToRemove, frequencyMap.get(elementToRemove) - 1);
                l++;
            }

            res = Math.max(res, (r - l + 1));
        }

        return res;
    }
}
