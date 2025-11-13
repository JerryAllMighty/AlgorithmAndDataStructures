package Search.DFS;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class BJ11724 {

    static int[][] graph;
    static boolean[] visited;

//    static void dfs(int node) {
//        visited[node] = true;
//        for (int i = 1; i < graph.length; i++) {
//            if (graph[node][i] != 0 && !visited[i]) {
//                dfs(i);
//            }
//        }
//    }

    static void dfs(int node) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;
        while (!stack.isEmpty()) {
            int now = stack.pop();
            for (int i = 1; i < graph.length; i++) {
                if (graph[now][i] != 0 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[nodes[0]][nodes[1]] = 1;
            graph[nodes[1]][nodes[0]] = 1;
        }
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
