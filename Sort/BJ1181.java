package Sort;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BJ1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        Arrays.fill(words, "");
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!Arrays.stream(words).anyMatch(x -> x != null && x.equals(word))) {
                words[i] = word;
            }
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        for (String word : words) {
            if (!word.isEmpty()) {
                bw.write(word + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
