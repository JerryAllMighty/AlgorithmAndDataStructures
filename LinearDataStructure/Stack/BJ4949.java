package LinearDataStructure.Stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> answers = new ArrayList<>();
        while (true) {
            String sentence = br.readLine();
            Deque<Character> deque = new ArrayDeque<>();
            if (".".equals(sentence)) {
                break;
            }
            boolean isValid = true;

            for (char c : sentence.toCharArray()) {
                if ('(' == c || '[' == c) {
                    deque.addLast(c);
                } else if (')' == c) {
                    if (deque.isEmpty()) {
                        isValid = false;
                        continue;
                    }
                    Character lastCharacter = deque.getLast();
                    if ('(' == lastCharacter) {
                        deque.pollLast();
                    } else isValid = false;
                } else if (']' == c) {
                    if (deque.isEmpty()) {
                        isValid = false;
                        continue;
                    }
                    Character lastCharacter = deque.getLast();
                    if ('[' == lastCharacter) {
                        deque.pollLast();
                    } else isValid = false;
                }
            }
            if (isValid && deque.isEmpty()) {
                answers.add("yes");
//                bw.write("yes" + "\n");
            } else {
                answers.add("no");
//                bw.write("no" + "\n");
            }
        }

        for (int i = 0; i < answers.size() - 1; i++) {
            String answer = answers.get(i);
            bw.write(answer + "\n");
        }
        bw.write(answers.get(answers.size() - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
