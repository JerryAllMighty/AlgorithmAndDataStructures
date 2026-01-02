package NonLinearDataStructure.TopologySort;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BJ2252 {
    static List<Integer>[] arr;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] indegree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = info[0];
        int m = info[1];
        arr = new List[n + 1];
        indegree = new int[n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = nums[0];
            int b = nums[1];
            arr[a].add(b);
            indegree[b]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            visited[now] = true;
            bw.write(now + " ");
            for (int next : arr[now]) {
                if (visited[next]) {
                    continue;
                }
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);

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
