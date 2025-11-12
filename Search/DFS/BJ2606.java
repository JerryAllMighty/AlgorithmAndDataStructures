package Search.DFS;

import java.io.*;
import java.util.Arrays;

public class BJ2606 {

    static int[][] graph;
    static boolean[] visited;

    static void bfs(int start) {
        visited[start] = true;
        for (int i = 1; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                bfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] pair = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[pair[0]][pair[1]] = 1;
            graph[pair[1]][pair[0]] = 1;
        }
        bfs(1);
        int answer = 0;
        for (int i = 2; i < visited.length; i++) {
            if (visited[i]) {
                answer++;
            }
        }
        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
    /* 2025.11.12 BFS 풀이도 추가   

    static int[][] graph;
    static boolean[] visited;
    static int answer;
    static Queue<Integer> q;

    static void dfs(int node) {
        visited[node] = true;
        answer++;
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                bfs(i);
            }
        }
    }

    static void bfs(int node) {
        q = new ArrayDeque<>();
        q.add(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            answer++;
            for (int i = 1; i < graph.length; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] pair = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[pair[0]][pair[1]] = 1;
            graph[pair[1]][pair[0]] = 1;
        }
//        dfs(1);
        bfs(1);
        bw.write(Integer.toString(answer - 1));
        bw.flush();
        bw.close();
        br.close();
    }
     */
}
