/*
 * 2026.03.14 개인 문제 풀이 통과 못함, 복기 못 함
 * import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer>[] adj = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            adj[start].add(end);
            adj[end].add(start);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);

        int[] answers = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : adj[current]) {
                if (!visited[next]) {
                    answers[next] = current;
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            stringBuilder.append(answers[i]);
            stringBuilder.append("\n");
        }
        bw.write(stringBuilder.toString());
        bw.flush();
        bw.close();
    }
}





 */