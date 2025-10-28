package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LC345 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        List<Character> vowelList = new ArrayList<>();
        for (int i = s.length() - 1; i > -1; i--) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                    || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelList.add(c);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                    || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                Character vowel = vowelList.get(0);
                vowelList.remove(0);
                answer.append(vowel);
            } else {
                answer.append(c);
            }

        }
        System.out.println(answer.toString());
    }
}
