package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LC387 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] alphabetCountArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabetCountArray[c - 'a']++;
        }

        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabetCountArray[c - 'a'] == 1) {
                System.out.println(i);
                System.out.println("end");
                break;
            }
        }

        System.out.println(answer);


    }
}
