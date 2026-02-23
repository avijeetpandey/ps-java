/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mapOne = new HashMap<>();
        HashMap<Character, Integer> mapTwo = new HashMap<>();
        

        // populating the first map
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mapOne.put(ch, mapOne.getOrDefault(ch, 0) + 1);
        }

        // populuating the second map
        for(int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            mapTwo.put(ch, mapTwo.getOrDefault(ch, 0)+1);
        }

        for(char key: mapOne.keySet()) {
            if(mapOne.get(key).intValue() != mapTwo.getOrDefault(key, 0).intValue()){
                return false;
            }
        }
        
        return true;
    }
}
// @lc code=end

