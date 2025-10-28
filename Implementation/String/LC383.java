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
