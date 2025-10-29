package Implementation.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LC392 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        StringBuilder sb = new StringBuilder();

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (++index < t.length()) {
                char ch = t.charAt(index);
                if (c == ch) {
                    sb.append(ch);
                    break;
                }
            }

        }

        System.out.println(s.equals(sb.toString()));
    }
}
