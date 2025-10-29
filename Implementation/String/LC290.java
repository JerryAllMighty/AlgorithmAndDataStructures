package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LC290 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pattern = br.readLine();
        String s = br.readLine();
        String[] sArray = s.split(" ");

        StringBuilder patternStringBuilder = new StringBuilder();
        StringBuilder sStringBuilder = new StringBuilder();

        int patternNumber = 1;
        int sNumber = 1;

        int[] visitedPatterns = new int[26];
        HashMap<String, Integer> visitedSs = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (visitedPatterns[c - 'a'] == 0) {
                visitedPatterns[c - 'a'] = patternNumber;
                patternStringBuilder.append(Integer.toString(patternNumber));
                patternNumber++;
            } else {
                patternStringBuilder.append(Integer.toString(visitedPatterns[c - 'a']));
            }
        }

        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            if (!visitedSs.containsKey(str)) {
                visitedSs.put(str, sNumber);
                sStringBuilder.append(Integer.toString(sNumber));
                sNumber++;
            } else {
                sStringBuilder.append(Integer.toString(visitedSs.get(str)));
            }
        }

        System.out.println(patternStringBuilder.toString().equals(sStringBuilder.toString()));


    }
}

//2025.10.29 다른 사람 풀이 추가
//import java.util.HashMap;
//import java.util.Objects;
//
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//        String[] words = s.split(" ");
//        if (words.length != pattern.length()) {
//            return false;
//        }
//
//        HashMap<Character, String> map = new HashMap<>();
//
//        for (int i = 0; i < pattern.length(); i++) {
//            char ch = pattern.charAt(i);
//            String word = words[i];
//
//            if (map.containsKey(ch)) {
//                // If mapping for char already exists, check consistency
//                if (!map.get(ch).equals(word)) {
//                    return false;
//                }
//            } else {
//                // If mapping for char doesn't exist, check if word is already mapped to another char
//                if (map.containsValue(word)) {
//                    return false;
//                }
//                // Establish new mapping
//                map.put(ch, word);
//            }
//        }
//        return true;
//    }
