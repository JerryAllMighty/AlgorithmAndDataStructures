/*
 * 2026 03 17 개인 문제 풀이, 틀림
 * import java.io.*;
import java.util.*;

public class Main {
    static int[] answers;
    static Set<Integer>[] adjacentList;
    static int[] inDegree;
    static int[] weights;


    static void search() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        answers[1] = weights[1];

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (Integer i : adjacentList[current]) {
                if (--inDegree[i] == 0) {
                    queue.add(i);
                    answers[i] = answers[current] + weights[i];
                }

            }


        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        answers = new int[n + 1];
        Arrays.fill(answers, Integer.MAX_VALUE);
        adjacentList = new Set[n + 1];
        for (int i = 1; i <= n; i++) {
            adjacentList[i] = new HashSet<>();
        }
        inDegree = new int[n + 1];
        weights = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(stringTokenizer.nextToken());
            weights[i] = time;
            int adjacent = Integer.parseInt(stringTokenizer.nextToken());
            if (adjacent == -1) {
                continue;
            }
            inDegree[i]++;
            adjacentList[adjacent].add(i);
        }

        search();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(String.valueOf(answers[i]));
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}






 */