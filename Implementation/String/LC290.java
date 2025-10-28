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
