package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LC383 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String r = br.readLine();
        String m = br.readLine();

        int[] firstAlphabetCountArray = new int[26];
        int[] secondAlphabetCountArray = new int[26];

        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            firstAlphabetCountArray[c - 'a']++;
        }
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            secondAlphabetCountArray[c - 'a']++;
        }

        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            if(secondAlphabetCountArray[c-'a'] < firstAlphabetCountArray[c-'a']){
                System.out.println(false);
            }

        }
        System.out.println(true);
    }
}

//2025.10.29 다른 사람 풀이 추가
//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        // Initialize an array of count with the size 26...
//        int[] counter = new int[128];
//        // Traverse a loop through the entire String of magazine where char ch stores the char at the index of magazine...
//        for (final char ch : magazine.toCharArray())
//            ++counter[ch];
//        // Run another for loop for ransomNote...
//        for (final char ch : ransomNote.toCharArray())
//            // If the charachter doesn't exists in magazine for ransomNote, we return false...
//            if (--counter[ch] < 0)
//                return false;
//        return true;      // If nothing goes wrong, return true...
//    }
//}
