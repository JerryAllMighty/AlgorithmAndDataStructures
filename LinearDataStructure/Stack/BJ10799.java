package LinearDataStructure.Stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] info = br.readLine().split("");
        int[] lines = new int[info.length];
        Deque<String[]> deque = new ArrayDeque<>();
        for (int i = 0; i < info.length - 1; i++) {
            if ("(".equals(info[i]) && ")".equals(info[i + 1])) {

            }
            if ("(".equals(info[i])) {

                deque.add(new String[]{"(", String.valueOf(i)});
            } else {
                String[] values = deque.pollLast();
                for (int j = Integer.parseInt(values[1]); j <= i; j++) {
                    lines[j] += 1;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
