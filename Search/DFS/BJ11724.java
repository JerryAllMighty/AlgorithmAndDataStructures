package Search.DFS;

import java.io.*;
import java.util.Arrays;

public class BJ11724 {

    static int[][] graph;
    static boolean[] visited;

    static int isExistThenWhichNode() {
        for (int i = 0; i < graph.length; i++) {
            for (int val : graph[i]) {
                if (val == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] != 0) {
                graph[node][i]++;
                graph[i][node]++;
                if (!visited[i]) {
                    dfs(i);
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
        int nextNode = 1;
        for (int i = 0; i < m; i++) {
            int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[nodes[0]][nodes[1]] = 1;
            graph[nodes[1]][nodes[0]] = 1;
            if (i == 0) {
                nextNode = nodes[0];
            }
        }
        int answer = 0;
        while (nextNode > -1) {
            dfs(nextNode);
            answer++;
            nextNode = isExistThenWhichNode();
        }

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
