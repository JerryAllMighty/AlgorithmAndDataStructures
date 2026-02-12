package LinearDataStructure.List;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BJ1406 {
    /*
    * 2026.02.12 개인 문제 풀이, 틀림
    *  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> word = new ArrayList<>();
        char[] input = br.readLine().toCharArray();
        for (char c : input) {
            word.add(c);
        }
        ListIterator<Character> iterator = word.listIterator(word.size());
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] commands = br.readLine().split(" ");
            String command = commands[0];
            if ("P".equals(command)) {
                iterator.add(commands[1].charAt(0));
            } else if ("L".equals(command)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if ("D".equals(command)) {
                if (iterator.hasPrevious()) {
                    iterator.next();
                }
            } else if ("B".equals(command)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : word) {
            sb.append(c);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] command = br.readLine().split("");
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(command));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String[] directions = br.readLine().split(" ");
            String direction = directions[0];
            if ("L".equals(direction)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if ("D".equals(direction)) {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if ("B".equals(direction)) {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            } else {
                String targetString = directions[1];
                iterator.add(targetString);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
