package NonLinearDataStructure.TopologySort;

import java.io.*;
import java.util.*;

public class BJ2252 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        List<Integer>[] graph = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
//        int[][] graph = new int[n + 1][n + 1];
        int[] indegree = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] compare = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = compare[0];
            int b = compare[1];
            graph[a].add(b);
            indegree[b]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bw.write(node + " ");
            visited[node] = true;
            List<Integer> row = graph[node];
            for (int next : row) {
                //!visited[next] &&
                if (visited[next]) {
                    continue;
                }
                if (next != 0 && indegree[next] > 0) {
                    indegree[next]--;
                }
                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}

/*
 * 2026.01.02 새해 댓바람부터 메모리 초과. 1번째 시도
 * public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        int[][] graph = new int[n + 1][n + 1];
        int[] indegree = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] compare = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = compare[0];
            int b = compare[1];
            graph[a][b] = 1;
            indegree[b]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bw.write(String.valueOf(node) + " ");
            visited[node] = true;
            int[] row = graph[node];
            for (int i = 1; i <= n; i++) {
                if (row[i] > 0 && indegree[i] > 0) {
                    row[i]--;
                    indegree[i]--;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0 && !visited[i] && !queue.contains(i)) {
                    queue.add(i);
                }
            }

        }


        bw.flush();
        bw.close();
        br.close();
    }
 */
