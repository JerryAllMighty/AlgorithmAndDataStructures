package LinearDataStructure.List;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BJ1406 {
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
